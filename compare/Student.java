package compare;

public class Student implements Comparable<Student>{
    int rollNo;
    float marks;

    public Student(int rollNo, int marks){
        this.marks = marks;
        this.rollNo = rollNo;
    }

    public String toString(){
        return marks + "";
    }

    @Override
    public int compareTo(Student o) {
        int diff = (int)(this.marks - o.marks);
        return diff;
    }
}
