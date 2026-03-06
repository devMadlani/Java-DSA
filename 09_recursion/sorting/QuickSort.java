package recursion.sorting;

import java.util.Arrays;

public class QuickSort {
    static void main(String[] args) {
        int[] arr = {5,3,6,1,2,8};
        quickSort(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));

    }
    static void quickSort(int[] arr, int low, int high){
        if(low >= high){
            return;
        }
        int i = low;
        int j = high;
        int m = i + (j - i) / 2;
        int pivot = arr[m];

        while(i <= j){

            while(arr[i] < pivot){
                i++;
            }
            while(arr[j] > pivot){
                j--;
            }

            if(i <= j){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
                j--;
            }
        }

        quickSort(arr, low, j);
        quickSort(arr, i, high);

    }
}
