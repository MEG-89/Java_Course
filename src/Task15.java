import java.util.Scanner;

public class Task15 {
    public static void main(String[] args) {
        System.out.println("Укажите размер массива:");
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int mas[] = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.println(String.format("Укажите %d элемент массива из %d:", i + 1, size));
            mas[i] = scanner.nextInt();
        }

        for (int i = size - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (mas[j] > mas[j + 1]) {
                    int tmp = mas[j];
                    mas[j] = mas[j + 1];
                    mas[j + 1] = tmp;

                }
            }
        }
    }
}