package leetcode;

public class Q_1283_findMinDivisor {
    public static void main(String[] args) {
        int[] nums = {1,2,5,9};
        int threshold = 6;
        int ans = smallestDivisor(nums,threshold);
        System.out.println(ans);
    }
    static int smallestDivisor(int[] nums, int threshold){
        int start = 1;
        int end = findMax(nums);
        int mid;
        while(start <= end){
            mid = start + (end - start) / 2;
            if(canPossible(nums,threshold,mid)){
                end = mid - 1;
            }else {
                start = mid + 1;
            }
        }
        return start;
    }
    static int findMax (int[] nums){
        int max = nums[0];
        for(int num:nums){
            if(max <= num){
                max = num;
            }
        }
        return max;
    }
    static boolean canPossible(int[] nums, int threshold, int mid){
        int sum = 0;
        for(int num : nums){
            sum += (int) Math.ceil((double) num / mid);
        }
        return sum <= threshold;
    }
}
