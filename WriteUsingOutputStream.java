import java.io.FileOutputStream;
import java.io.IOException;

public class WriteUsingOutputStream {
    public static void main(String[] args) {
        String text = "Hello, this is a test using OutputStream!";
        try (FileOutputStream fos = new FileOutputStream("output.txt")) {
            fos.write(text.getBytes());
            System.out.println("Text written successfully.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
