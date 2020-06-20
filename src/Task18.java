import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;

public class Task18 {

    public static void main(String args[]) {
        String fileName = "file1.txt";
        int count = 0;
        try (FileReader fr = new FileReader(fileName)) {
            Scanner scan = new Scanner(fr);
            while (scan.hasNextLine()) {
                System.out.println(scan.nextLine());
                count++;
            }

        } catch (Exception e) {
            System.out.println("Произошла ошибка: " + e.getMessage());
        }

        try (FileWriter fw = new FileWriter(fileName)) {
            System.out.println("Введите " + count + "  строк для перезаписи:");
            Scanner scan = new Scanner(System.in);
            for (int i = 0; i < count; i++)
                fw.write(scan.nextLine() + "\r\n");

        } catch (Exception e) {
            System.out.println("Произошла ошибка: " + e.getMessage());
        }
    }
}