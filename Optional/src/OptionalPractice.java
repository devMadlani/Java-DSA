import java.util.Optional;

public class OptionalPractice {
    public static void main(String[] args) {
        // Problem - 1
        Optional<String> name = Optional.of("Dev maDlani");
        name.map(String::toUpperCase)
                .ifPresent(System.out::println);

        // Problem - 2
        String value = "Dev Madlani";
        String result = Optional.ofNullable(value)
                .orElse("Default");
        System.out.println(result);

        // Problem 3 — orElse vs orElseGet
        

    }
}
