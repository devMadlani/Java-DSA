package leetcode;

public class Q_875_KokoEatingBananas {
    public static void main(String[] args) {
        int[] piles = {3,6,7,11};
        int h = 8;
        int ans = minEatingSpeed(piles,h);
        System.out.println(ans);
    }
    static int minEatingSpeed(int[] piles, int h){
        int start = 1;
        int end = getMax(piles);
        int mid;
        while(start <= end){
            mid = start + (end - start) / 2;
            if(canFinish(piles, h, mid)) {
                end = mid - 1;
            }else{
                start = mid + 1;
            }
        }
        return start;
    }
    static boolean canFinish(int[] piles, int h, int speed){
        int hours = 0;
        for(int pile : piles){
            hours += Math.ceil((double) pile/ (double)speed);
        }
        return hours <= h;
    }
    static int getMax(int[] piles){
        int max = piles[0];
        for(int pile:piles){
            if(pile >= max) {
                max = pile;
            }
        }
        return max;
    }
}
