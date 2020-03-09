import java.util.Scanner;

public class PrimeNumberBreak {

    public static void main(String[] args) {

        System.out.println("Введите натуральное число: ");
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        

        int i;
        boolean isComposite = false;


        for (i = 2; i < n; i++) {
            if (n % i == 0) {
                isComposite = true;
                break;
            }

        }
        if (isComposite) {
            System.out.println("Вы ввели составное число");
        } else {
            System.out.println("Вы ввели простое число");
        }
    }
}
