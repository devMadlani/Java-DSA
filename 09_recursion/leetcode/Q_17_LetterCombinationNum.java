package leetcode;

import java.util.ArrayList;

public class Q_17_LetterCombinationNum {
    public static void main(String[] args) {
        String digit = "4";
        System.out.println(letterCombinationNum("",digit));
    }

    static String[] mapped = {"", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};

    static ArrayList<String> letterCombinationNum(String p, String up) {
        if (up.isEmpty()) {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        int digit = up.charAt(0) - '0';
        String value = mapped[digit];
        ArrayList<String> list = new ArrayList<>();
        for (int i = 0; i < value.length(); i++) {
            char ch = value.charAt(i);
            list.addAll(letterCombinationNum(p + ch, up.substring(1)));
        }
        return list;
    }
}
