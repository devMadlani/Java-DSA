import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        int n = in.nextInt();
//        boolean ans = armstrong(n);
        for (int i = 100; i <1000 ; i++) {
            if(armstrong(i)){
                System.out.println(i);
            }
        }

    }
    static boolean armstrong(int n){
        int originalValue = n;
        int sum = 0;
        while(n > 0){
            int rem =  n % 10;
            n /= 10;
            sum = sum + (rem * rem * rem);
        }
        return  sum == originalValue;
    }


}
