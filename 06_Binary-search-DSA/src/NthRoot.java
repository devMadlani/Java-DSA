public class NthRoot {
    public static void main(String[] args) {
        int n = 9;
        int m = 1953125;
        int ans = nthRoot(n,m);
        System.out.println(ans);

    }

    static int power(int mid, int n, int m) {
        long ans = 1;
        for (int i = 1; i <= n; i++) {
            ans *= mid;
            if (ans > m) return 2;
        }
        if (ans == m) return 1;
        return 0;
    }
    static int nthRoot(int n, int m){
        int start = 1; int end = m;
        while(start <= end){
            int mid = start + (end - start) / 2;
            int midN = power(mid,n,m);
            if(midN == 1) return mid;
            else if(midN == 0) start = mid + 1;
            else end = mid - 1;
        }
        return -1;
    }
}
