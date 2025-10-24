package leetcode;

public class Q_1539_findKthNumber {
    public static void main(String[] args) {
        int[] arr = {2,3,4,7,11};
        int k = 5;
        int ans = findKthNumber(arr,k);
        System.out.println(ans);
    }
    static int findKthNumber(int[] arr, int k){
        int start = 0;
        int end = arr.length - 1;
        while(start <= end){
            int mid = start + (end - start) / 2;
            int missing = arr[mid] - (mid + 1);
            if(missing < k){
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return k + start;
    }
}
