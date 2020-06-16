import java.util.Scanner;

public class Task14 {
    public static void main(String[] args) {
        System.out.println("Введите число:");
        String s = new Scanner(System.in).nextLine();
        int x = Integer.parseInt(s);
        double y = x;
        System.out.println(s + '\n' + x + '\n' + y);
    }
}