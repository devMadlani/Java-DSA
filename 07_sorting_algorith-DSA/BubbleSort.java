package sorting;

import java.util.Arrays;

public class BubbleSort {
    static void main(String[] args) {
        int[] arr = {3,5,1,6,4,1};
        bubbleSortDesc(arr);
//        bubbleSortAsc(arr);
//        bubbleSmallValue(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void swap(int[] arr, int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
    static void bubbleSortDesc(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            for (int j = 1; j < arr.length - i; j++) {
                if(arr[j] > arr[j - 1]){
                    swap(arr, j , j-1);
                }
            }
        }
    }
    static void bubbleSortAsc(int[] arr){
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if(arr[j] > arr[j + 1]){
                    swap(arr, j , j + 1);
                }
            }
        }
    }
    static void bubbleSmallValue(int[] arr){
        for (int i = 0; i < arr.length - 1; i++) {
            for(int j = arr.length - 1; j > i; j--){
                if(arr[j] < arr[j - 1]){
                    swap(arr, j, j - 1);
                }
            }
        }
    }
}
