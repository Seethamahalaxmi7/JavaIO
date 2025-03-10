import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class WriteUsingBufferedWriter {
    public static void main(String[] args) {
        String text = "BufferedWriter example in Java.";
        try (BufferedWriter bw = new BufferedWriter(new FileWriter("output.txt"))) {
            bw.write(text);
            System.out.println("Text written successfully.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
