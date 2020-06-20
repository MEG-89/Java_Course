import java.io.FileWriter;
import java.util.Scanner;

public class Task17 {

    public static void main(String args[]) {

        try (FileWriter fw = new FileWriter("file_new.txt")) {
            System.out.println("Запись будет вестись до тех пор, пока не будет введено слово \"стоп\".");
            Scanner scan = new Scanner(System.in);
            String s = scan.nextLine();

            while (!"стоп".equalsIgnoreCase(s)) {
                fw.write(s + "\r\n");
                s = scan.nextLine();
            }
        } catch (Exception e) {
            System.out.println("Произошла ошибка: " + e.getMessage());
        }
    }
}