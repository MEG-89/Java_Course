import java.util.Scanner;

// copy Task4
class FinalTask1 {
    public static void main(String args[]) {
        System.out.println("Введите любое число в бинарном формате: ");
        String text = new Scanner(System.in).next();
        int result = 0;
        for (int i = 0; i < text.length(); i++)
            if (text.charAt(text.length() - 1 - i) == '1')
                result = result + raisingToPower(i, 2);

        System.out.println("Результат перевода Вашего числа в десятичный формат: " + result);
    }

    private static int raisingToPower(int power, int base) {
        int result = 1;
        for (int i = 1; i <= power; i++)
            result = result * base;

        return result;
    }
}