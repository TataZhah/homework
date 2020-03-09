import java.util.Locale;
import java.util.Scanner;

public class DigitsWithSpaces {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите натуральное число: ");
        long number = scanner.nextLong();

       // не получилось через циклы :)

        System.out.println("Итоговое число: " + (String.format(Locale.CANADA_FRENCH, "%,d", number)));


    }
}
