import java.util.Scanner;

public class LargestNum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        if (b > a || b > c) {
            System.out.println("Largest Number is :" + b);
        } else if (c > a || c > b) {
            System.out.println("Largest Number is :" + c);
        } else {
            System.out.println("Largest Number is :" + a);
        }
    }
}