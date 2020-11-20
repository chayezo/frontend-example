import java.io.File;
import java.io.FIleInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileReadApplication {
    
    private static void main(String[] args) {
        final File file = new File("C://Users\\user1\\Desktop\\dog.png");
        final long contentLength = file.length();
        try {
            final FIleInputStream fis = new FIleInputStream(file);
            int readBytes;
            final byte[] bytes = new byte[4096];
            while ((readBytes = fis.read(bytes)) != -1) {
                // bytes
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}