public class LCM {
    static int lcm (int n1, int n2){
        int greater = Math.max(n1, n2);
        while(true){

        if(greater % n1 == 0 && greater % n2 == 0){
            return greater;
        }
        greater++;
        }
    }

    public static void main(String[] args) {
        System.out.println(lcm(4,6));
    }
}
