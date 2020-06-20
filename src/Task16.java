import java.io.*;
import java.util.Scanner;

public class Task16 {

    public static void main(String args[]){
        try {

            FileReader fr = new FileReader("file.txt");
            Scanner scan = new Scanner(fr);

            while (scan.hasNextLine()) {
                System.out.println(scan.nextLine());
            }
            fr.close();
        } catch (Exception e){
            System.out.println("Произошла ошибка: "+ e.getMessage());
        }
    }
}
