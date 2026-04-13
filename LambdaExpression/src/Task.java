public class Task {
    String name;

    public Task(String name){
        this.name = name;
    }


    public Task() {
        this.name = "Default Task"  ;
    }

    public void display(){
        System.out.println("Task " + name);
    }
}
