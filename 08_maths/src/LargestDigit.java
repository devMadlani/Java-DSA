public class LargestDigit {
    static int largeDigit (int n){
        int largeNum = 0;
        while(n > 0){
            int digit = n % 10;
            if(digit > largeNum){
                largeNum = digit;
            }
            n /= 10;
        }
        return largeNum;
    }

    public static void main(String[] args) {
        int num = 9358;
        System.out.println(largeDigit(num));
    }
}
