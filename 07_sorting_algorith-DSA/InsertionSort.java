package sorting;

import java.util.Arrays;

public class InsertionSort {
    static void main(String[] args) {
        int[] arr = {3,2,5,1,3,6};
        insertionSort(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void insertionSort(int[] arr){
        for (int i = 0; i < arr.length - 1; i++) {
            int j = i + 1;
            while(j > 0 && arr[j] < arr[j - 1]){
                int temp = arr[j];
                arr[j] = arr[j - 1];
                arr[j - 1] = temp;
                j--;
            }
        }
    }
}
