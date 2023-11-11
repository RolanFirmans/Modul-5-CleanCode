
package modul5;

/**
 *
 * @author Rolan Firmansyah
 */
import java.io.*;
public class ExcepTest {
    public static void main(String args[]) {
        try {
            int a[] = new int[2];
            System.out.println("Access element three :" + a[3]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Exception thrown :" + e);
        }
            System.out.println("Out of the block");
            FileInputStream file = null;
            byte x;
        String fileName = "example.txt"; // Ganti dengan nama file yang sesuai
        try {
            file = new FileInputStream(fileName);
            x = (byte) file.read();
        } catch (FileNotFoundException f) {
            f.printStackTrace();
            return -1;
        } catch (IOException i) {
            i.printStackTrace();
            return -1;
        }
        System.out.println("Out of the file handling block");
    }
}
