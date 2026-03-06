package sorting.cyclicSort.leetcode;
import java.util.ArrayList;
import java.util.Arrays;

public class Q_448_FindAllMissingNum {
    static void main(String[] args) {
        int[] arr = {4,3,2,7,8,2,3,1};
        System.out.println(findAllMissingNum(arr));
    }
    static ArrayList<Integer> findAllMissingNum(int[] arr){
        int i = 0;
        while(i < arr.length){
            if( arr[i] != arr[arr[i] - 1]){
                int temp = arr[arr[i] - 1];
                arr[arr[i] - 1] = arr[i];
                arr[i] = temp;
            } else {
                i++;
            }
        }
        System.out.println(Arrays.toString(arr));
        ArrayList<Integer> list = new ArrayList<>();
        for (int j = 0; j < arr.length; j++) {
            if(j != arr[j] - 1 ){
                list.add(j + 1);
            }
        }
        return  list;
    }
}
