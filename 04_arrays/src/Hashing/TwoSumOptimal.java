package Hashing;

import java.util.Arrays;

public class TwoSumOptimal {
    static int[] twoSumOptimal(int[] arr,int target){
        int i = 0, j = arr.length - 1;
        Arrays.sort(arr);
        while(i < j){
            int sum = arr[i] + arr[j];
            if(sum == target){
                return new int[]{i, j};
            } else if (sum < target){
                i++;
            } else {
                j--;
            }
        }
        return new int[]{-1, -1};
    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 2, 5};
        int target = 6;
        System.out.println(Arrays.toString(twoSumOptimal(arr, target)));
    }
}
