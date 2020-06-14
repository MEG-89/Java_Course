import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        System.out.println("Введите значение переменной x: ");
        int x = new Scanner(System.in).nextInt();
        System.out.println("Введите значение переменной y: ");
        int y = new Scanner(System.in).nextInt();
        System.out.println("Введите значение переменной z: ");
        int z = new Scanner(System.in).nextInt();
        double avr = (x + y + z) / 3.0;
        System.out.println("Cреднее арифметическое чисел x, y, z = " + avr);
        int result = (int)(avr / 2);
        if (result > 3)
            System.out.println("Программа выполнена корректно");
    }
}
