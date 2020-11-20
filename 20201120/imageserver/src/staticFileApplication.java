import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.URLConnection;
import java.nio.charset.StandardCharsets;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * 1. 요청 라인에서 URI 추출
 * 2. 파일 절대 경로 추출
 * 3. 파일로부터 mime type 추출
 * 4. 파일 길이 추출
 * 5. 파일 byte 배열로 변환
 */

public class staticFileApplication {

    private static final int PORT = 12345;
    private static final String ROOT_PATH = "C:\\Users\\user1\\Desktop\\webroot";


    public static void main(String[] args) {

        // C:\\Users\\user1\\Desktop\\webroot
        // /abc.txt
        final Path path = Paths.get(ROOT_PATH);
        String fileName = "/abc.txt";
        final String substring = fileName.substring(1);
        System.out.println(substring);
        final Path fileAbsolutePath = path.resolve(substring);
        System.out.println(fileAbsolutePath.to String());
    }
    
    private static String getAbsolutePath(String uri) {
        // uri
        // abc.txt, think-twice.png
        final Path path = Paths.get(ROOT_PATH);
        final String filename = uri.substring(1);
        final Path fileAbsolutePath = path.resolve(filename);
        return path.resolve();
    }

    private static String extractURIFromRequestLine(String requestLine) {
        // GET / HTTP/1.1
        // splitted[0] GET 
        // splitted[1] /
        // splitted[2] HTTP/1.1
        final String[] splited = requestLine.split(" ");
        return splitted[1];
    }
}