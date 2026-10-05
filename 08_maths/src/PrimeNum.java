public class PrimeNum {
    static boolean isPrime(int n){
        if(n <= 1) return false;

        for (int i = 2; i <= n / i; i++) {
            if(n % i == 0) return false;
        }
        return  true;
    }

    public static void main(String[] args) {
        System.out.println(isPrime(4));
    }
}
