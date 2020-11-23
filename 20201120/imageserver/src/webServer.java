import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.nio.charset.StandardCharsets;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * 1. 요청 라인에서 URI 추출
 * 2. 파일 절대 경로 생성
 * 3. 파일로부터 mime type 추출
 * 4. 파일 길이 추출
 * 5. 파일 byte 배열로 변환
*/

public class webServer {
    private static final int PORT = 8080;
    private static final String ROOT_PATH = "Users/"
}