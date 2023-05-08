import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * Checked_and_Unchecked_Exeptions
 */
public class Checked_and_Unchecked_Exeptions {

    public static void main(String[] args) {
        FileReader test = null;
        try {
        test = new FileReader("test");
        test.read();
        } catch (RuntimeException | IOException exception) {
            throw new RuntimeException("Catch exeption: " + exception.getClass().getSimpleName());
        } finally {
            System.out.println("finally start");
            if (test != null) {
                try {
                    test.close();
                } catch (IOException e) {
                    System.out.println("Exeption while close");
                }
            }
            System.out.println("finally finish");
        }
    }
}