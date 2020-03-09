public class Factorial {

    public static void main(String[] args) {
        int number = 20;
        long factorial = 1;
        int i = 1;
        while (i <= number) {
            factorial = factorial * i;
            i++;
        }
        System.out.println("Факториал " + number + " = " + factorial);
    }
}
