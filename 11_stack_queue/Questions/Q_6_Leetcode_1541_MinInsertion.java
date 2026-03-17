package Stack.Questions;

public class Q_6_Leetcode_1541_MinInsertion {
    public int minInsertions(String s) {
        int res = 0;
        int need = 0;

        for (char ch : s.toCharArray()) {
            if (ch == '(') {
                need += 2;
                if (need % 2 == 1) {
                    res++;
                    need--;
                }
            } else {
                need--;
                if (need == -1) {
                    res++;
                    need = 1;
                }
            }
        }
        return res + need;
    }
}
