package recursion.subset_subseq;

import java.util.ArrayList;
import java.util.List;

public class IterativeSubSeq {
    static void main(String[] args) {
        int[] arr = {1, 2, 3};
        List<List<Integer>> ans = subset(arr);
        System.out.println(ans);
    }

    static List<List<Integer>> subset(int[] arr) {
        List<List<Integer>> outer = new ArrayList<>();
        outer.add(new ArrayList<>());
        for (int num : arr) {
            int n = outer.size();
            for (int i = 0; i < n; i++) {
                List<Integer> internal = new ArrayList<>(outer.get(i));
                internal.add(num);
                outer.add(internal);
            }
        }

        return outer;
    }

}
