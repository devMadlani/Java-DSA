import java.time.LocalDateTime;
import java.util.Date;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class LambdaExpression {
    public static void main(String[] args) {
        // Predicate
        Predicate<Integer> isEven = x -> x % 2 == 0;
        Predicate<Integer> isGreaterThan10 = x -> x > 10;
        Predicate<Integer> result = isEven.and(isGreaterThan10);
        System.out.println(result.test(8));

        Predicate<Integer> greaterThanFifty = x -> x > 50;
        System.out.println(greaterThanFifty.test(30));

        // Function
        Function<Integer, Integer> square = x -> x * 10;
        System.out.println(square.apply(50));
        Function<String, String> upperCase = String::toUpperCase;
        System.out.println(upperCase.apply("ddfd"));

        // Consumer
        Consumer<String> print = System.out::println;
        print.accept("Dev");
        Consumer<String> printLen = x -> System.out.println(x.length());
        printLen.accept("Madlani");

        // Supplier
        Supplier<Integer> supplier = () -> 199;
        System.out.println(supplier.get());
        Supplier<Integer> random = () -> (int)(Math.random() * 10);
        System.out.println(random.get());
        Supplier<LocalDateTime> currentTime = LocalDateTime::now;
        System.out.println(currentTime.get());
    }
}
