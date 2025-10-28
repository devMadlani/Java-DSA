import java.util.Arrays;

public class AllocateBooks {
    public static void main(String[] args) {
        int[] arr = {25, 46, 28, 49, 24};
        int m = 4;
        int ans = allocateBooks(arr, m);
        System.out.println(ans);
    }

    static int allocateBooks(int[] arr, int m) {
        if(arr.length < m) return -1;
        int start = findMax(arr);
        int end = findSum(arr);
        System.out.println(start + " " + end);
        while (start <= end) {
            int mid = start + (end - start) / 2;
            int std = canAllocate(arr, mid);
            if (std <= m) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return start;
    }

    static int canAllocate(int[] arr, int mid) {
        int std = 1;
        int pages = 0;
        for (int ele : arr) {
            if (pages + ele > mid) {
                std++;
                pages = ele;
            } else {
                pages += ele;
            }
        }
        return std;

    }

    static int findMax(int[] arr) {
        int max = arr[0];
        for (int ele : arr) {
            if (max < ele) {
                max = ele;
            }

        }
        return max;
    }

    static int findSum(int[] arr) {
        int sum = 0;
        for (int ele : arr) {
            sum += ele;
        }
        return sum;
    }
}
