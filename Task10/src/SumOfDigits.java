import java.util.Scanner;

public class SumOfDigits {

    public static void main(String[] args) {

        System.out.println("Ввести число: ");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int sum = 0;
        while(n != 0){
            sum += (n % 10);
            n /=10;
        }
        System.out.println("Сумма цифр числа = " + sum);
    }
}
