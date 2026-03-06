package compare;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Student s1 = new Student(12, 109);
        Student s2 = new Student(5, 99);
        Student s3 = new Student(5, 99);
        Student s4 = new Student(5, 99);
        Student s5 = new Student(5, 99);
        Student[] list = {s1,s2,s3,s4,s5};
        System.out.println(Arrays.toString(list));
        Arrays.sort(list);
        System.out.println(Arrays.toString(list));
        if(s1.compareTo(s2) < 0){
            System.out.println("s2 has more marks");
        } else {
            System.out.println("s1 has more marks");
        }
    }
}
