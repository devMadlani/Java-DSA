package leetcode;

public class Q_1482_minDayMakeBouquets {
    public static void main(String[] args) {
        int[] bloomDay = {7, 7, 7, 7, 13, 11, 12, 7};
        int m = 2;
        int k = 3;
        int ans = minDays(bloomDay, m, k);
        System.out.println(ans);
    }

    static int minDays(int[] bloomDay, int m, int k) {
        int start = findMinMax(bloomDay, false);
        int end = findMinMax(bloomDay, true);
        int mid;
        while (start <= end) {
            mid = start + (end - start) / 2;
            if (canMake(bloomDay, m, k, mid)) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return start;

    }

    static boolean canMake(int[] bloomDAy, int m, int k, int mid) {
        int count = 0;
        int bouquets = 0;
        for (int day : bloomDAy) {
            if (day <= mid) {
                count++;
            } else {
                bouquets += count / k;
                count = 0;
            }
        }
        bouquets += count / k;
        return bouquets >= m;
    }

    static int findMinMax(int[] bloomDay, boolean isMax) {
        int val = bloomDay[0];
        for (int day : bloomDay) {
            if (isMax) {
                if (val <= day) {
                    val = day;
                }
            } else {
                if (val >= day) {
                    val = day;
                }
            }
        }
        return val;
    }
}
