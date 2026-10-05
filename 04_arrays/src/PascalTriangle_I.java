public class PascalTriangle_I {
    static int pascalTriangleI(int r, int c) {
        int res = 1;
        r--;
        c--;
        for (int i = 0; i < c; i++) {
            res = res * (r - i);
            res = res / (i + 1);
        }
        return res;
    }

    public static void main(String[] args) {
        int r = 5, c = 3;
        System.out.println(pascalTriangleI(r, c));
    }
}
