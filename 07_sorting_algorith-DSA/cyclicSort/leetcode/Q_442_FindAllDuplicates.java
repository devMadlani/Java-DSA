package sorting.cyclicSort.leetcode;

import java.util.ArrayList;

public class Q_442_FindAllDuplicates {
    static void main(String[] args) {
        int[] arr = {2,1,3,1,3,4,2,4,5};
        System.out.println(findAllDuplicates(arr));
    }
    static ArrayList<Integer> findAllDuplicates (int[] arr){
        int i = 0;
        while(i < arr.length){
            if(arr[i] != arr[arr[i] - 1]) {
                int temp = arr[arr[i] - 1];
                arr[arr[i] - 1] = arr[i];
                arr[i] = temp;
            } else {
                i++;
            }
        }

        ArrayList<Integer> list = new ArrayList<>();
        for (int j = 0; j < arr.length; j++) {
            if(arr[j] != j + 1){
                list.add(arr[j]);
            }

        }
        return list;
    }
}
