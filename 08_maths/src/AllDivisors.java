import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class AllDivisors {
    static int[] allDivisors(int n) {
        List<Integer> allDivisors = new ArrayList<>();
        for (int i = 1; i <= n / i; i++) {
            if (n % i == 0) {
                int pair = n / i;
                allDivisors.add(i);
                if ((pair) != i) {
                    allDivisors.add(pair);
                }
            }
        }
        Collections.sort(allDivisors);
        return allDivisors.stream().mapToInt(Integer::intValue).toArray();
    }
}
