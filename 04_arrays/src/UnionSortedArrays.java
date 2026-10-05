import java.util.ArrayList;

public class UnionSortedArrays {
    static ArrayList<Integer> unionArray(int[] nums1, int[] nums2) {
        int n1 = nums1.length;
        int n2 = nums2.length;
        int i = 0;
        int j = 0;
        ArrayList<Integer> union = new ArrayList<>();
        while (i < n1 && j < n2) {
            if (nums1[i] < nums2[j]) {
                if (union.isEmpty() || union.getLast() != nums1[i]) {
                    union.add(nums1[i]);
                }
                i++;
            } else {
                if (union.isEmpty() || union.getLast() != nums2[j]) {
                    union.add(nums2[j]);

                }
                j++;
            }
        }
        while (i < n1) {
            if (union.isEmpty() || union.getLast() != nums1[i]) {
                union.add(nums1[i]);
            }
            i++;
        }
        while (j < n2) {
            if (union.isEmpty() || union.getLast() != nums2[j]) {
                union.add(nums2[j]);
            }
            j++;
        }
        return union;
    }

    public static void main(String[] args) {
//        int[] arr1 = {1, 2, 3, 3, 4, 5, 8};
//        int[] arr2 = {2, 2, 4, 5, 8, 9};
        int[] arr1 = {1, 2};
        int[] arr2 = {3, 3, 4, 4};
        System.out.println(unionArray(arr1, arr2));
    }

}
