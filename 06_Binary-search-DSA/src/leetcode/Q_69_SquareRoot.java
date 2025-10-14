package leetcode;

public class Q_69_SquareRoot {
    public static void main(String[] args) {
        int x = 2147395599;
        int ans = mySqrt(x);
        System.out.println(ans);
    }

    static int mySqrt(int x) {
        long start = 1;
        long end = x;
        long mid;
        while (start <= end) {
            mid = start + (end - start) / 2;
            if (mid * mid <= x) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return (int) end;
    }
}
