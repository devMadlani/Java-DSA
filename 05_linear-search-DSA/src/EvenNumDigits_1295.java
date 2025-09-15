public class EvenNumDigits_1295 {
    // https://leetcode.com/problems/find-numbers-with-even-number-of-digits/
    public static void main(String[] args) {
        int[] arr = {12,231,1,4234};
        int ans = evenNumDigits(arr);
        System.out.println(ans);
    }
    static int evenNumDigits(int[] arr) {
        if (arr.length == 0) {
            return 0;
        }
        int countEven = 0;
        for (int element : arr) {
            if(even(element)) countEven++;
        }
        return  countEven;
    }

    static boolean even(int num){
        int numberOfDigits = digits(num);
        return numberOfDigits % 2 == 0 ;
    }

    static int digits(int num){
        if(num < 0) num *= -1;
//        int count = 0;

//        while (num > 0){
//            count++;
//            num/=10;
//        }
//        return count;
        return (int) (Math.log10(num));
    }
}
