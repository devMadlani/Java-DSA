package recursion.arrays;

public class RotatedBS {
    public static void main(String[] args) {
        int[] arr = {5, 6, 7, 1, 2, 3};
        System.out.println(rotatedBs(arr, 0, arr.length - 1, 12));
    }

    static int rotatedBs(int[] arr, int s, int e, int target) {
        if (s > e) {
            return -1;

        }
        int m = s + (e - s) / 2;
        if (arr[m] == target) {
            return m;
        }
        if (arr[s] <= arr[m]) {
            if (target >= arr[s] && target <= arr[m]) {
                return rotatedBs(arr, s, m - 1, target);
            } else {
                return rotatedBs(arr, m + 1, e, target);
            }
        }
        if (target >= arr[m] && target <= arr[e]) {
            return rotatedBs(arr, m + 1, e, target);
        }
        return rotatedBs(arr, s, m - 1, target);

    }
}
