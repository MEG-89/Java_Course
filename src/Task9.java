import java.util.Scanner;

public class Task9 {
    public static void main(String[] args) {
        System.out.println("Укажите размер массива:");
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int mas[] = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.println(String.format("Укажите %d элемент массива из %d:", i + 1, size));
            mas[i] = scanner.nextInt();
        }

        System.out.println("Вывод массива, где каждый элемент массива умножается на 2:");

        for (int i = 0; i < size; i++)
            System.out.println(mas[i] * 2);
    }
}