package recursion.sorting;

import java.util.Arrays;

public class BubbleSort {

    public static void main(String[] args) {
        int[] arr = {5, 3, 2, 4};
//        bubbleSort(arr, 0, 0);
        bubbleSort2(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }
    // bubble up large value last
    static void bubbleSort(int[] arr, int i, int j) {
        if (i == arr.length) {
            return;
        }
        if (j < arr.length - 1 - i) {

            if (arr[j] > arr[j + 1]) {
                int temp = arr[j + 1];
                arr[j + 1] = arr[j];
                arr[j] = temp;
            }
            bubbleSort(arr, i, j + 1);
        } else {

        bubbleSort(arr, i + 1, 0);
        }
    }

    // bubble up small value first
    static void bubbleSort2(int[] arr, int i, int j){
        if(i == arr.length - 1){
            return;
        }
        if(j > i){
            if(arr[j] < arr[j - 1]){
                int temp = arr[j - 1];
                arr[j - 1] = arr[j];
                arr[j] = temp;
            }
            bubbleSort2(arr, i, j-1);
        }
        bubbleSort2(arr, i+1, arr.length - 1);
    }
}