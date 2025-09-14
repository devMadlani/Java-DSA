import java.util.Scanner;

public class ReverseNum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int reversNum = 0;
        while(n > 0){
            int rem = n % 10;
            n /= 10;
            reversNum = (reversNum * 10) + rem;
        }
        System.out.println(reversNum);
    }
}
