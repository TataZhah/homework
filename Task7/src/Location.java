import java.util.Scanner;

public class Location {

    public static void main(String[] args) {


        System.out.println("Введите a - сторону 1го прямоугольника:");
        Scanner scan1 = new Scanner(System.in);
        int a = scan1.nextInt();

        System.out.println("Введите b - сторону 1го прямоугольника:");
        Scanner scan2 = new Scanner(System.in);
        int b = scan2.nextInt();

        System.out.println("Введите c - сторону 2го прямоугольника");
        Scanner scan3 = new Scanner(System.in);
        int c = scan3.nextInt();

        System.out.println("Введите d - сторону 2го прямоугольника");
        Scanner scan4 = new Scanner(System.in);
        int d = scan4.nextInt();

        System.out.println("Введите e - сторону участка");
        Scanner scan5 = new Scanner(System.in);
        int e = scan5.nextInt();

        System.out.println("Введите f - сторону участка");
        Scanner scan6 = new Scanner(System.in);
        int f = scan6.nextInt();

        if (((a <= e) & (b <= f))){
            System.out.println("1ый дом помещается");
            if ((((e - a) >= c)) & ((f - b >= d))) {
                System.out.println("2ой дом помещается");
            }

            else {
                System.out.println("2ой дом не помещается");
            }
        }
        else if ((b <= e) & (a <= f)) {
            System.out.println("1ый дом помещается");
            if ((((e - b) >= c)) & ((f - a >= d))) {
                System.out.println("2ой дом помещается");
            }

            else {
                System.out.println("2ой дом не помещается");
            }

        }
        else {
            System.out.println("Не помещаются");
        }


    }


}
