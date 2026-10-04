package Hashing;
import java.util.Arrays;

public class Leetcode_128_LongestConsecutive_better {
    static int longestConsecutive(int[] arr) {
        if(arr.length == 0) return 0;
        Arrays.sort(arr);
        int longest = 1, count = 0, lastSmallest = Integer.MIN_VALUE;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] - 1 == lastSmallest){
                count++;
                lastSmallest = arr[i];
            } else if (arr[i] != lastSmallest){
                count = 1;
                lastSmallest = arr[i];
            }
            longest = Math.max(longest, count);
        }
        return longest;
    }

    public static void main(String[] args) {
        int[] arr = {100,4,200,1,3,2};
        System.out.println(longestConsecutive(arr));
    }
}
