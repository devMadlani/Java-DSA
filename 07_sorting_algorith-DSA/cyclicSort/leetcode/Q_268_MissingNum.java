package sorting.cyclicSort.leetcode;

public class Q_268_MissingNum {
    static void main(String[] args) {
        int[] arr= {0,1};
        System.out.println(missingNum(arr));

    }
    static int missingNum (int[] arr){
        int i = 0;
        while(i < arr.length){
            if(arr[i] < arr.length && arr[i] != arr[arr[i]]){
                int temp = arr[arr[i]];
                arr[arr[i]] = arr[i];
                arr[i] = temp;

            } else {
                i++;
            }
        }

        for (int j = 0; j < arr.length; j++) {
            if(arr[j] != j){
                return j;
            }
        }
        return arr.length;
    }
}
