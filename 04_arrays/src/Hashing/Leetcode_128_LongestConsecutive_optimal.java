package Hashing;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Leetcode_128_LongestConsecutive_optimal {
    static int longestConsecutive(int[] arr) {
        Set<Integer> values = new HashSet<>();
        for(int value : arr){
            values.add(value);
        }
        int longestLength = 0;

        for(int val : values){
            if(values.contains(val - 1)) continue;

            int count = 1;
            int nextVal = val + 1;
            while(values.contains(nextVal)){
                count++;
                nextVal++;
            }
            longestLength = Math.max(longestLength, count);
        }
        return longestLength;
    }

    public static void main(String[] args) {
        int[] arr = {1,4,6,8,23};
        System.out.println(longestConsecutive(arr));
    }
}
