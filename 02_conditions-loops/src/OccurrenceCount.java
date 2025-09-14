import java.util.Scanner;

public class OccurrenceCount {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int count = 0;
        while(n > 0){
            int ram = n % 10;
            if(ram == 5){
                count++;
            }
            n = n / 10;
        }
        System.out.println(count);
    }
}
