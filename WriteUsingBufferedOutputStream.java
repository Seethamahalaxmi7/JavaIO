import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class WriteUsingBufferedOutputStream {
    public static void main(String[] args) {
        String text = "BufferedOutputStream example.";
        try (BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("output.txt"))) {
            bos.write(text.getBytes());
            bos.flush();
            System.out.println("Text written successfully.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
