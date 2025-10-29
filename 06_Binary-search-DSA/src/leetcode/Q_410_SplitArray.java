package leetcode;

public class Q_410_SplitArray {
    public static void main(String[] args) {
        int[] arr = {7, 2, 5, 10, 8};
        int k = 2;
        int ans = splitArray(arr, k);
        System.out.println(ans);
    }

    static int splitArray(int[] arr, int k) {
        int start = findMax(arr);
        int end = findSum(arr);
        while (start <= end) {
            int mid = start + (end - start) / 2;
            int subArrays = subArrayNum(arr, mid);
            if (subArrays <= k) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return start;
    }

    static int subArrayNum(int[] arr, int mid){
        int sum = 0;
        int subArray = 1;
        for(int ele : arr){
            if(sum + ele > mid){
                subArray++;
                sum = ele;
            }else{
                sum += ele;
            }
        }
        return subArray;
    }
    static int findMax(int[] arr){
        int max = arr[0];
        for(int ele : arr){
            if(max < ele){
                max = ele;
            }
        }
        return max;
    }
    static int findSum(int[] arr){
        int sum = 0;
        for(int ele: arr){
            sum += ele;
        }
        return sum;
    }
}
