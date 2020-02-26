public class FindR {


    public static void main(String[] args) {

        double r = 2;
        double a = 2;
        double b = 3;
        double s = a*a+b*b;

        if ((r * r) >= (s / 2))
            System.out.println("Закрывает");
        else
            System.out.println("Не закрывает");

    }

}