import java.util.Scanner;

public class PrimeNumber {

    public static void main(String[] args) {

        System.out.println("Введите натуральное число: ");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int i;


        for (i = 2; i < n; i++) {
            if (n % i == 0) {
                System.out.println("Составное");
                return;
            }

        }
        System.out.println("Простое");


    }
}
