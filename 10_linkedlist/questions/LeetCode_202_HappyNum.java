package linkedList.questions;

public class LeetCode_202_HappyNum {
    public static void main(String[] args) {
        int n = 12;
        System.out.println(isHappyNum(n));
    }
    public static boolean isHappyNum(int n) {
        int slow = n;
        int fast = n;
        do {
            slow = findSqueare(slow);
            fast = findSqueare(findSqueare(fast));
        } while (slow != fast);
        return slow == 1;
    }

    private static int findSqueare(int n) {
        int ans = 0;
        while(n > 0){
            int rem = n % 10;
            ans += rem * rem;
            n /= 10;
        }
        return  ans;

    }

}
