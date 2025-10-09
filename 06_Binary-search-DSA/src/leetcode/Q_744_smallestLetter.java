// https://leetcode.com/problems/find-smallest-letter-greater-than-target/description/

package leetcode;

public class Q_744_smallestLetter {
    public static void main(String[] args) {
        char[] arr = {'c', 'f', 'j'};
        char ans = nextGreatestLetter(arr, 'z');
        System.out.println(ans);
    }

    public static char nextGreatestLetter(char[] letters, char target) {
        int start = 0;
        int end = letters.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target >= letters[mid]) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        if (start >= letters.length) {
            return letters[0];
        } else {
            return letters[start];
        }
    }

}



