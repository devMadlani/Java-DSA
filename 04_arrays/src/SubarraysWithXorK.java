import java.util.HashMap;
import java.util.Map;

public class SubarraysWithXorK {
    static int subarraysWithXorK(int[] nums, int k) {
        int xr = 0;
        int count = 0;
        Map<Integer, Integer> map = new HashMap<>();
        map.put(0, 1);
        for (int i = 0; i < nums.length; i++) {
            xr = xr ^ nums[i];
            int x = xr ^ k;
            if (map.containsKey(x)) {
                count += map.get(x);
            }
            map.put(xr, map.getOrDefault(xr, 0) + 1);
        }
        return count;
    }

    public static void main(String[] args) {
        int[] arr = {4, 2, 2, 6, 4};
        int k = 6;
        System.out.println(subarraysWithXorK(arr, k));
    }
}
