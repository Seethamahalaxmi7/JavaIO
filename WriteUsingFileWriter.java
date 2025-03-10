import java.io.FileWriter;
import java.io.IOException;

public class WriteUsingFileWriter {
    public static void main(String[] args) {
        String text = "Writing using FileWriter in Java.";
        try (FileWriter fw = new FileWriter("output.txt")) {
            fw.write(text);
            System.out.println("Text written successfully.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}