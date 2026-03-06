package sorting;

import java.util.Arrays;

public class SelectionSort {
    static void main(String[] args) {
        int[] arr = {8,7,4,3,1};
        selectionSortMin(arr);
//        selectionSortMax(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void selectionSortMin(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            int minIndex = i;
            for (int j = i + 1; j < arr.length; j++) {
                if(arr[j] < arr[minIndex]){
                    minIndex = j;
                }
            }
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
    }
    static void selectionSortMax(int[] arr){
        for (int i = arr.length - 1; i > 0; i--) {
            int maxIndex = i;
            for (int j = 0; j < i; j++) {
                if(arr[j] > arr[maxIndex]){
                    maxIndex = j;
                }
            }
            int temp = arr[maxIndex];
            arr[maxIndex] = arr[i];
            arr[i] = temp;
        }
    }
}
