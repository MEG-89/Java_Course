import java.util.Scanner;

public class Task5 {

    public static void main(String[] args) {
        System.out.println("Введите любое число: ");
        int base = new Scanner(System.in).nextInt();

        int start = 1;

        System.out.println(String.format(new String(new char[10]).replace("\0", "%s"),
                row(base, start++),
                row(base, start++),
                row(base, start++),
                row(base, start++),
                row(base, start++),
                row(base, start++),
                row(base, start++),
                row(base, start++),
                row(base, start++),
                row(base, start)));
    }

    private static String row(int base, int start) {
        String text = "%d *  %d = %d \n";
        if (start == 10)
            text = "%d * %d = %d \n";

        return String.format(text, base, start, base * start);
    }
}
