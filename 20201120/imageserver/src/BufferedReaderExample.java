import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.nio.charset.StandardCharsets;

public class BufferedReaderExample {

    // localhost: 8081
    private static final int PORT = 8081;

    pubilc static void main(String[] args) {

        final String html = "<!DOCTYPE html>\n" +
                "<html>\n" +
                "    <head>\n" +
                "        <title>Hello HTTP Server!</title>\n" +
                "    </head>\n" +
                "    <body>\n" +
                "        <h1>제목이고</h1>\n" +
                "        <p>내용이야</p>\n" +
                "    </body>\n" +
                "</html>";

        try {
            // 1.
            final ServerSocket serverSocket = new ServerSocket(PORT);
            Socket socket;
            while ((socket = serverSocket.accept()) != null) {
                final InputStream in = socket.getInputStream();
                final InputStreamReader isr = new InputStreamReader(in);
                final BufferedReader br = new BufferedReader(isr);

                // 2.
                // br.readLine() 요청 라인, 요청 헤더. 문자열 " " 만날 때 까지 읽기.
                String line;
                while (!"".equals.((line = br.readLine()))) {
                    System.out.println(line);

                }

                // 3. html
                final OutputStream out = socket.getOutputStream();

                // 3.1. 상태 라인
                final String statusLine = "HTTP/1.1 200 OK";
                out.write(converStringToBytes(statusLine));

                // 3.2. 헤더
                final String contentType = "Content-Type: text/html;";
                // Content-Type: text/html;
                out.write(convertStringToBytes(contentType));
                // Content-Length: 160
                final String contentLength = "Content-Length: " + html.length();
                out.write(convertStringToBytes(contentLength));
                // 헤더 끝을 명시해주기 위해 CRLF를 넣음.
                out.write(convertStringToBytes("\r\n"));

                
                // 3.3. 바디


            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static byte[] convertStringToBytes(String statusLine) {
        return statusLine.getBytes(StandardCharsets.UTF_8);
    }
    
}