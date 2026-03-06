package recursion;

public class Level1 {
    public static void main(String[] args) {
//        printNto1(5);
//        print1toN(5);
        System.out.println(factorial(5));
        System.out.println(sumOfN(5));
        System.out.println(sumOfDigits2(1234513245));
        System.out.println(prodOfDigits(12345));
        System.out.println(reverseNum(12345));
        System.out.println(countZeros(1234500000, 0));

    }

    // Q1- print n to 1
    static void printNto1(int n){
        if(n == 1){
            System.out.println(n);
            return;
        }
        System.out.println(n);
        printNto1(n - 1);
    }

    // Q2- print 1 to n
    static void print1toN(int n){
        if(n == 1){
            System.out.println(n);
            return;
        }
        print1toN(n - 1);
        System.out.println(n);
    }

    //Q3- product of n to 1
    static int factorial(int n) {
        if(n == 1){
            return n;
        }
        return n * factorial(n - 1);
    }

    //Q4- sum of n
    static int sumOfN(int n) {
        if(n == 1){
            return n;
        }
        return n + sumOfN(n - 1);
    }

    //Q5- sum of digits ex. => 1234 = 10
    static int sum = 0;
    static void sumOfDigits(int n) {
        if(n == 0){
            return;
        }
        int rem = n % 10;
        sum += rem;
        sumOfDigits(n / 10);
    }

    static int sumOfDigits2(int n){
        if(n == 0) {
            return 0;
        }
        int rem = n % 10;
        return rem + sumOfDigits2(n / 10);
    }


    // Q6 - Product Of digits
    static int prodOfDigits(int n){
        if(n == 0){
            return 1;
        }

        int rem = n % 10;
        return rem * prodOfDigits(n / 10);
    }

    // Q7 - reverse a number
    static int reverseNum(int n){
        if(n % 10 == n){
            return n;
        }
        int digits = (int) Math.log10(n) + 1;
        int rem = n % 10;
        return (int) (rem * Math.pow(10, digits - 1)) + reverseNum(n / 10);

    }

    // Q8 - count zeros in num
    static int countZeros(int n, int count){
        if(n == 0){
            return count;
        }
        if( n % 10 == 0){
            count++;
        }

        return countZeros(n/ 10, count);
    }

}
