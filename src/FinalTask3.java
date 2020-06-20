import java.util.Scanner;

public class FinalTask3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Double rate = 0.0;
        Double rub = 0.0;

        System.out.println("Введите текущий курс доллара:");
        try {
            rate = Double.valueOf(scanner.nextLine());
        } catch (Exception e) {
            System.err.println("Введены некорректные данные: " + e.getMessage());
            return;
        }

        System.out.println("Введите количество рублей:");
        try {
            rub = Double.valueOf(scanner.nextLine());
        } catch (Exception e) {
            System.err.println("Введены некорректные данные: " + e.getMessage());
            return;
        }

        Double result = (double) (Math.round((rub / rate) * 100)) / 100;
        System.out.println("Итого долларов: " + result);
    }
}