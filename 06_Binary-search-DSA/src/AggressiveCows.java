import java.util.Arrays;

public class AggressiveCows {
    public static void main(String[] args) {
        int[] stalls = {0, 3, 4, 6, 10, 9};
        int cows = 4;
        int ans = aggressiveCows(stalls, cows);
        System.out.println(ans);
    }

    static int aggressiveCows(int[] stalls, int cows) {
        Arrays.sort(stalls);
        int start = 0;
        int end = stalls[stalls.length - 1] - stalls[0];
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (canCowPlaced(stalls, mid, cows)) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return end;
    }

    static boolean canCowPlaced(int[] stalls, int mid, int cows) {
        int cowPlaced = 1;
        int last = stalls[0];
        for (int i = 1; i < stalls.length; i++) {
            if(stalls[i] - last >= mid){
                cowPlaced++;
                last = stalls[i];
            }
            if(cowPlaced >= cows){
                return  true;
            }
        }
        return false;
    }
}
