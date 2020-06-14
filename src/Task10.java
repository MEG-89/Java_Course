import java.util.Scanner;

public class Task10 {
    public static void main(String[] args) {
        System.out.println("Укажите количество строк массива:");
        Scanner scanner = new Scanner(System.in);
        int row = scanner.nextInt();
        System.out.println("Укажите количество столбцов массива:");
        int column = scanner.nextInt();
        int mas[][] = new int[row][column];
        for (int i = 0; i < row; i++)
            for (int y = 0; y < column; y++) {
                System.out.println(String.format("Укажите значение для %d строки %d столбца", i + 1, y + 1));
                mas[i][y] = scanner.nextInt();
            }

        System.out.println("Вывод первой строки массива, где каждый элемент умножен на 3:");

        for (int i = 0; i < column; i++)
            System.out.println(mas[0][i] * 3);
    }
}