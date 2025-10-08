package leetcode;

public class Q_852_PeakInMountain {
    public static void main(String[] args) {
        int[] nums = {3,5,3,2,0};
        int ans = peakInMountain(nums);
        System.out.println(ans);
    }
    static int peakInMountain (int[] nums){
        int start = 0;
        int end = nums.length - 1;
        while(start <= end){
            int mid = start + (end - start) / 2;
            if(nums[mid] >  nums[mid - 1] && nums[mid] > nums[mid + 1]){
                return mid;
            }
            if(nums[mid] < nums[mid+1]){
                start = mid + 1;
            }else if(nums[mid] < nums[mid - 1]){
                end = mid - 1;
            }
            else{
                return mid;
            }
        }
        return start;
    }
}
