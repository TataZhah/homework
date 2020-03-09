public class TheBiggestRandom {

    public static void main(String[] args) {
        int maxnumber = 0;
        int n = (int)(Math.random() *20);
        int i = 0;

        while (n >= maxnumber) {
            maxnumber = n;
            i++;
            n = (int)(Math.random() *20);
        }
        System.out.println("Наибольшее число: " + maxnumber);
    }
}
