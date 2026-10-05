import java.util.Arrays;

public class PrimeUptoN {
    static int primeUptoN(int n){
        int count = 0;
        for (int i = 2; i <= n ; i++) {
            if(PrimeNum.isPrime(i)){
                count++;
            }
        }
        return count;
    }

    //Sieve of Eratosthenes,

    static int primeUptoNSieveofEratosthenes (int n) {
        if (n < 2) {
            return 0;
        }

        boolean[] isPrime = new boolean[n + 1];

        Arrays.fill(isPrime, true);

        isPrime[0] = false;
        isPrime[1] = false;

        for (int i = 2; i <= n / i; i++) {

            if (isPrime[i]) {

                for (int j = i * i; j <= n; j += i) {
                    isPrime[j] = false;
                }
            }
        }

        int count = 0;

        for (int i = 2; i <= n; i++) {
            if (isPrime[i]) {
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        System.out.println(primeUptoN(6));
    }
}
