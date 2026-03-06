import java.util.ArrayList;
import java.util.Arrays;

public class Permutation {
    public static void main(String[] args) {
        String s = "abc";
        permutation("", s);
        System.out.println(permutatoinWithReturn("", s));
        System.out.println(permutationCount("", s));
    }

    static void permutation(String p, String up) {
        if (up.isEmpty()) {
            System.out.println(p);
            return;
        }
        char ch = up.charAt(0);
        for (int i = 0; i <= p.length(); i++) {
            String s = p.substring(0, i);
            String e = p.substring(i);
            permutation(s + ch + e, up.substring(1));
        }
    }

    static ArrayList<String> permutatoinWithReturn(String p, String up) {
        if (up.isEmpty()) {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        char ch = up.charAt(0);
        ArrayList<String> list = new ArrayList<>();

        for (int i = 0; i < p.length() + 1; i++) {
            String s = p.substring(0, i);
            String e = p.substring(i);
            list.addAll(permutatoinWithReturn(s + ch + e, up.substring(1)));
        }
        return list;
    }

    static int permutationCount(String p, String up) {
        if (up.isEmpty()) {
            return 1;
        }
        int count = 0;
        char ch = up.charAt(0);
        for (int i = 0; i < p.length() + 1; i++) {
            String s = p.substring(0, i);
            String e = p.substring(i);
            count += permutationCount(s + ch + e, up.substring(1));
        }
        return count;
    }
}
