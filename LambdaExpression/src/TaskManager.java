import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.function.Consumer;
import java.util.function.Supplier;

public class TaskManager {
    public static void main(String[] args) {
        List<Task> tasks = new ArrayList<>();
        Supplier<Task> taskSupplier = () -> new Task("Auto Task " + new Random().nextInt());

        for (int i = 0; i < 3; i++) {
            tasks.add(taskSupplier.get());
        }

        Consumer<Task> print = x -> System.out.println(x.name);

        tasks.forEach(print);

        // using method Ref
        System.out.println("Using Method Reference");
        tasks.forEach(System.out::println);

        tasks.forEach(Task::display);


        Supplier<Task> newTask = Task::new;

    }
}
