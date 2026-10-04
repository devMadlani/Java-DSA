public class GCD {
    static int GCD(int n1, int n2) {
            int gcd = 0;
        for (int i = 1; i <= Math.min(n1, n2); i++) {
            if(n1 % i == 0 && n2 % i == 0){
                gcd = i;
            }
        }
        return gcd;
    }
    static int equilateralGCD(int n1, int n2){
        while (n1 > 0 && n2 > 0){
            if(n1 > n2) n1 = n1 % n2;
            if(n2 > n1) n2 = n2 % n1;
        }
        if (n1 == 0) return n2;
        return n1;
    }

    public static void main(String[] args) {
        int n1 = 12, n2 = 24;
        System.out.println(GCD(n1, n2));
        System.out.println(equilateralGCD(n1,n2));

    }
}