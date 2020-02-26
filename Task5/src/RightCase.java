import java.util.Scanner;

public class RightCase {

    public static void main(String[] args) {

        System.out.print("Введите любое целое число: ");
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();
        int x = number % 10;

        if (( x == 0) || x >= 5 && x <= 9) {
            System.out.println(number + " рублей");
        }
        else if (x >= 2 && x <= 4) {
            System.out.println(number + " рублей");
        }
        else {
            System.out.println(number + " рубль");
        }

    }
}
