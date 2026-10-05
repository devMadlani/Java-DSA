// A perfect number is a number whose proper divisors (excluding the number itself) add up to the number itself.
public class PerfectNum {
    static boolean perfectNum (int n) {
        if(n <= 1) return false;

        int sum = 1;
        for (int i = 2; i <= n / i; i++) {
            if(n % i == 0){
                sum += i;
            int pair = n / i;
            if(pair != i) sum += pair;
            }
        }
        return sum == n;
    }

    public static void main(String[] args) {
        int n = 28;
        System.out.println(perfectNum(n));
    }
}

