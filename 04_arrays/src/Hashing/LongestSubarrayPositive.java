package Hashing;

import java.util.HashMap;
import java.util.Map;

public class LongestSubarrayPositive {
    static int longestSubarrayPositive(int[] arr, int k) {
        int i = 0, j = 0;
        int sum = arr[0];
        int maxLength = 0;
        while (j < arr.length) {
            while(i <= j && sum > k){
                sum -= arr[i];
                i++;
            }
            if(sum == k){
                maxLength = Math.max(maxLength, j - i + 1);

            }
            j++;
            if (j < arr.length) sum += arr[j];

        }
        return maxLength;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,5, 1, 3,3};
        int k = 7;
        System.out.println(longestSubarrayPositive(arr, k));
    }
}
