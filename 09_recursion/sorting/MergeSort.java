package recursion.sorting;

import java.util.Arrays;
public class MergeSort {
    static void main(String[] args) {
        int[] arr = {3,4,1,5,2};
        mergeSort(arr, 0, arr.length -1 );
        System.out.println(Arrays.toString(arr));
    }

    // End is inclusive
    static void mergeSort(int[] arr, int s, int e) {
        if (e - s == 0) {
            return;
        }
        int m = s + (e - s) / 2;

        mergeSort(arr, s, m);
        mergeSort(arr, m+1, e);

        merge(arr, s, m ,e);
    }

     static void merge(int[] arr, int s, int m, int e) {
        int[] mix = new int[e - s + 1];
        int i = s;
        int j = m + 1;
        int k = 0;
        while(i <= m && j <= e){
            if(arr[i] <= arr[j]){
                mix[k++] = arr[i++];
            } else {
                mix[k++] = arr[j++];
            }
        }

        while (i <= m){
            mix[k++] = arr[i++];
        }

         while (j <= e){
             mix[k++] = arr[j++];
         }

         for(int l = 0; l < mix.length; l++){
             arr[l + s] = mix[l];
         }
    }
}
