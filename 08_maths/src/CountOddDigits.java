public class CountOddDigits {
    static int countOddDigits(int num){
        int count = 0;
        while(num > 0){
            int digit = num % 10;
            if(digit % 2 != 0){
                count++;
            }
            num /= 10;
        }
        return count;
    }

    public static void main(String[] args) {
        int num = 560511333;
        System.out.println(countOddDigits(num));
    }
}
