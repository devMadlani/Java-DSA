import java.util.*;

// note: (i != j != k),
// only unique triplets ex. [-1, 0 , 1] == [1, -1, 0]

public class Leetcode_15_3Sum_better {
    static List<List<Integer>> threeSum(int[] nums) {
        int n = nums.length;
        if(n < 3){
            return new ArrayList<>();
        }
        Set<List<Integer>> uniqueTriplets = new HashSet<>();
        for(int i = 0; i < n - 2; i++){
            Set<Integer> seenVals = new HashSet<>();
            for (int j = i+1; j < n; j++) {
                int third = -(nums[i] + nums[j]);
                if(seenVals.contains(third)){
                    List<Integer> triplets = new ArrayList<>(
                            Arrays.asList(nums[i], nums[j], third)
                    );
                    Collections.sort(triplets);
                    uniqueTriplets.add(triplets);
                }

                seenVals.add(nums[j]);
            }
        }
        return new ArrayList<>(uniqueTriplets);
    }

    public static void main(String[] args) {
        int[] arr = {-1, 0, 1, 2, -1, -4};
        System.out.println(threeSum(arr));
    }
}
