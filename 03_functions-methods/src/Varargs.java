public class Varargs {
    public static void main(String[] args) {
        printNum();
        printNum(1,2,4);
        printNum(6,7,8,9,10);
    }
    static void printNum(int... num){
        for(int n : num){
            System.out.print(n + "");
        }
        System.out.println();
    }

}
