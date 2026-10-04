package Hashing;

import java.util.HashMap;
import java.util.Map;

public class LongestSubarray{
    static int longestSubarray(int[] arr, int k){
        int maxLength = 0;
        int sum = 0;
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++){
            sum += arr[i];

            if(sum == k){
                maxLength = i + 1;
            }
            int rem = sum - k;
            // reverse checking
            if(map.containsKey(rem)){
                int length = i - map.get(rem);
                maxLength = Math.max(maxLength, length);
            }
            // it not includes submission of zero in already exists so it will not override the existing sum index
            if(!map.containsKey(sum)){
                map.put(sum, i);
            }
    
        }
        return maxLength;
    }

    public static void main(String[] args) {
        int[] arr = {-3,1,3};
        int k = 1;
        System.out.println(longestSubarray(arr,k));
    }
}
