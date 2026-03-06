package sorting.cyclicSort.leetcode;

import java.util.Arrays;

public class Q_287_FindDuplicate {
    static void main(String[] args) {

        int[] arr = {4,3,2,7,8,2,3,1};
        System.out.println(findDuplicate(arr));
    }

    static int findDuplicate(int[] arr) {
        int i = 0;
        while(i < arr.length){
            if(arr[i] != arr[arr[i] - 1]){
                int temp = arr[arr[i] - 1];
                arr[arr[i] - 1] = arr[i];
                arr[i] = temp;
            } else {
                i++;
            }
        }

        return arr[arr.length - 1];
    }
}
