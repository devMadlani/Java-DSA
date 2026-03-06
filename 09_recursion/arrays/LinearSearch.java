package recursion.arrays;

import java.util.ArrayList;

public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = {3, 2, 1, 9, 18, 18};
        System.out.println(isAvail(arr, 0, 18));
//        System.out.println(findAllIndex(arr, 0, 18, new ArrayList<>()));
        findAllIndexWithoutArrayList(arr, 0, 18);
        System.out.println(findAllIndexWithoutArrayList(arr, 0, 18));
    }


    static boolean isAvail(int[] arr, int i, int target) {
        if (i == arr.length) return false;
        if (arr[i] == target) {
            return true;
        }
        return isAvail(arr, i + 1, target);
    }

    static ArrayList<Integer> findAllIndex(int[] arr, int i, int target, ArrayList<Integer> list) {
        if (i == arr.length) {
            return list;
        }
        if (arr[i] == target) {
            list.add(i);
        }
        return findAllIndex(arr, i + 1, target, list);
    }


    static ArrayList<Integer> findAllIndexWithoutArrayList(int[] arr, int i, int target) {
     ArrayList<Integer> listNew = new ArrayList<>();
        if (i == arr.length) {
            return listNew;
        }
        if (arr[i] == target) {
            listNew.add(i);
        }
        ArrayList<Integer> ansFromBelow = findAllIndexWithoutArrayList(arr, i + 1, target);
        listNew.addAll(ansFromBelow);
        return listNew;
    }
}
