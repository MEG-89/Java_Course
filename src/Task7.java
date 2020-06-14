import java.util.Scanner;

public class Task7 {

    public static void main(String[] args) {
        System.out.println("Введите число: ");
        int number = new Scanner(System.in).nextInt();
        final int X = 6;
        final int Y = 10;
        final int Z = 22;
        String text;
        switch (number) {
            case X:
            case Y:
            case Z:
                text = "Данное значение имеется в константах.";
                break;
            default:
                text = "Такой константы нет!";
                break;
        }

        System.out.print(text);
    }
}