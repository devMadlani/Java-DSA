package ObjectClone;

import java.util.Arrays;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws  CloneNotSupportedException {
        Student s1 = new Student(23,"Dev");
        Student s2 = (Student) s1.clone();
        s1.name = "dev";
        s2.name = "dev2";
        System.out.println(Arrays.toString(s1.arr));
        s1.arr[1] = 100;
        System.out.println(Arrays.toString(s2.arr));

        System.out.println(s1.name);
    }

}
class Student implements Cloneable {
    int id;
    String name;
    int[] arr;

    public Student(int id, String name){
        this.id = id;
        this.name = name;
        this.arr = new int[]{34,4,5,6,7};

    }
//    public Student(Student other){
//        this.id = other.id;
//        this.name = other.name;
//    }

   @Override
    public Object clone() throws  CloneNotSupportedException {
       List<Integer> list = new LinkedList<>();
        Student s1 = (Student) super.clone();
        s1.arr = new int[s1.arr.length];
       for (int i = 0; i < s1.arr.length; i++) {
            s1.arr[i] = this.arr[i];
       }
       return s1;
   }
}