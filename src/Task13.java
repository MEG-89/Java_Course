import java.util.Scanner;

public class Task13 {
    public static void main(String[] args) {
        System.out.println("Введите первую строку:");
        String str1 = new Scanner(System.in).nextLine();
        System.out.println("Введите вторую строку:");
        String str2 = new Scanner(System.in).nextLine();

        if (str1.length() == str2.length())
            System.out.println("Длины строк равны.");
        else {
            if (str2.length() > str1.length())
                str1 = str2;

            System.out.println("Строка с наибольшей длиной: " + str1);
        }
    }
}