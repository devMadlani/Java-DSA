import java.text.DecimalFormat;
import java.util.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // constructor 1
        StringBuffer sb1 = new StringBuffer(); // capacity is 16 default
        System.out.println(sb1.capacity());

        // constructor 2
        StringBuffer sb2 = new StringBuffer("Hello"); // capacity is 16 default
        System.out.println(sb2.capacity());

        // constructor 3
        StringBuffer sb3 = new StringBuffer(30);
        System.out.println(sb3.capacity());

        sb1.append("Dev Madlani");
//      sb1.insert(3, " is");
        sb1.replace(0, 3,"Darshu");
        sb1.delete(0,6);
        sb1.reverse();

        String str = sb1.toString();
        System.out.println(str);

        // random string
        int n = 20;
        String name =  RandomString.generate(n);
        System.out.println(name);

        // Remove whitespaces

        String sentence = "Hii   h hjh hhhhs      sdds  ds";

        System.out.println(sentence);
        System.out.println(sentence.replaceAll("\\s", ""));

        // split
        String arr = "dev dev1 dev2 dev3";
        String[] names = arr.split(" ");
        System.out.println(Arrays.toString(names));


        // rounding off
        DecimalFormat df = new DecimalFormat("0.000");
        System.out.println(df.format(7.61357));
    }
}