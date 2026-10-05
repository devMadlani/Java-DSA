import java.util.ArrayList;

public class IntersectionSortedArrays {
    static ArrayList<Integer> intersection(int[] arr1, int[] arr2) {
        int i = 0;
        int j = 0;
        ArrayList<Integer> interSec = new ArrayList<>();
        while (i < arr1.length && j < arr2.length) {
            if (arr1[i] < arr2[j]) {
                i++;
            } else if (arr2[j] < arr1[i]) {
                j++;
            } else {
                interSec.add(arr1[i]);
                i++;
                j++;
            }

        }
        return interSec;
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 2, 2, 3, 4, 5};
        int[] arr2 = {2, 2, 3, 4, 5};
        System.out.println(intersection(arr1, arr2));
    }
}
