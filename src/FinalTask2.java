import java.util.Scanner;

public class FinalTask2 {
    public static void main(String[] args) {
        System.out.println("Укажите размер массива:");
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int mas[] = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.println(String.format("Укажите %d элемент массива из %d:", i + 1, size));
            mas[i] = scanner.nextInt();
        }
        int min;
        int tmp;
        for (int i = 0; i < size - 1; i++) {
            min = i;
            for (int j = i + 1; j < size; j++) {
                if (mas[j] < mas[min])
                    min = j;
            }
            tmp = mas[min];
            mas[min] = mas[i];
            mas[i] = tmp;
        }
    }
}