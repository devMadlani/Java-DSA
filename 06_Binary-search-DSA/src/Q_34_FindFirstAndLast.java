// https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/

import java.util.Arrays;

public class Q_34_FindFirstAndLast {
    public static void main(String[] args) {
        int[] nums = {5,7,7,8,8,10};
        int target = 5;
        int[] ans = searchRange(nums,target);
        System.out.println(Arrays.toString(ans));

    }
    public static int[] searchRange(int[] nums, int target) {
        int[] ans = {-1,-1};
        int start = findIndex(nums,target,true);
        int last = findIndex(nums,target,false);
        ans[0] = start;
        ans[1] = last;
        return ans;
    }
    public static int findIndex(int[] nums, int target, Boolean isSearchFirst){
        int ans = -1;
        int start = 0;
        int end = nums.length - 1;
        while(start <= end){
            int mid = start + (end - start)  / 2;
            if(target < nums[mid]){
                end = mid - 1;
            }else if(target > nums[mid]){
                start = mid + 1;
            }else {
                ans = mid;
                if(isSearchFirst){
                    end = mid - 1;
                }
                else{
                    start = mid + 1;
                }
            }

        }
        return ans;
    }

}
