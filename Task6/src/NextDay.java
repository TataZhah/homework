import java.util.Scanner;

public class NextDay {



    public static void main(String[] args) {

        System.out.println("Введите день (натуральное число от 1 до 31)");
        Scanner scan1 = new Scanner(System.in);
        int d1 = scan1.nextInt();

        System.out.println("Введите месяц (нтуральное число от 1 до 12)");
        Scanner scan2 = new Scanner(System.in);
        int m1 = scan2.nextInt();

        System.out.println("Введите год");
        Scanner scan3 = new Scanner(System.in);
        int y1 = scan3.nextInt();


        int d2;
        int m2;
        int y2;

        // високосный год
        if ((y1 % 400 == 0) || ((y1 % 4 == 0) && (y1 % 100 != 0))) {
            if (m1 == 2 & d1 == 28) {
                d2 = 29;
                m2 = m1;
                y2 = y1;

            }
            else if ((d1 == 31) & (m1 == 12)) {
                d2 = 1;
                m2 = 1;
                y2 = y1 + 1;
            }
            else if ((m1 == 4) || (m1 == 6) || (m1 == 9) || (m1 == 11)) {
                if (d1 == 30) {
                    d2 = 1;
                    m2 = m1 + 1;
                    y2 = y1;
                }
                else {
                    d2 = d1 +1;
                    m2 = m1;
                    y2 = y1;
                }

            }
            else {
                if (d1 == 31) {
                    d2 = 1;
                    m2 = m1 + 1;
                    y2 = y1;
                }
                else {
                    d2 = d1 +1;
                    m2 = m1;
                    y2 = y1;
                }
            }


        // обычный год
        }
        else if (m1 == 2 & d1 == 28){
            d2 = 1;
            m2 = m1;
            y2 = y1;
        }
        else if ((d1 == 31) & (m1 == 12)) {
            d2 = 1;
            m2 = 1;
            y2 = y1 + 1;
        }
        else if ((m1 == 4) || (m1 == 6) || (m1 == 9) || (m1 == 11)) {
            if (d1 == 30) {
                d2 = 1;
                m2 = m1 + 1;
                y2 = y1;
            }
            else {
                d2 = d1 +1;
                m2 = m1;
                y2 = y1;
            }

        }
        else {
            if (d1 == 31) {
                d2 = 1;
                m2 = m1 + 1;
                y2 = y1;
            }
            else {
                d2 = d1 +1;
                m2 = m1;
                y2 = y1;
            }
        }

        System.out.println (d2 + "." + m2 + "." + y2);



    }
}