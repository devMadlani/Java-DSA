import java.util.*;
import java.util.stream.Collectors;

public class Streams {
    public static void main(String[] args) {
        // problem - 1
        List<List<Integer>> list = Arrays.asList(Arrays.asList(1, 2, 3), Arrays.asList(4, 5), Arrays.asList(6, 7, 8));

        list.stream().flatMap(Collection::stream).filter(x -> x % 2 == 0).map(x -> x * x).forEach(System.out::println);

        // problem - 2
        class User {
            String name;
            int age;

            User(String name, int age) {
                this.name = name;
                this.age = age;
            }
        }

        List<User> users = Arrays.asList(new User("Dev", 22), new User("Amit", 17), new User("Sara", 25), new User("John", 30));

        Map<String, List<User>> result = users.stream().collect(Collectors.groupingBy(u -> u.age < 18 ? "Minor" : "Adult"));
        System.out.println(result);


        // problem - 3 find highest value
        List<Integer> list2 = Arrays.asList(5, 12, 7, 20, 30);
        int max = list2.stream().reduce(Integer.MIN_VALUE, (a, b) -> a > b ? a : b);
        System.out.println(max);

        // problem - 4 get total revenue

        class Order {
            List<Integer> prices;

            Order(List<Integer> prices) {
                this.prices = prices;
            }

            List<Integer> getPrices() {
                return prices;
            }
        }
        List<Order> orders = Arrays.asList(new Order(Arrays.asList(100, 200)), new Order(Arrays.asList(300, 400)));

        int total = orders.stream().flatMap(x -> x.getPrices().stream()).reduce(Integer.MIN_VALUE, (a, b) -> a > b ? a : b);
        System.out.println(total);

        // problem - 5 partition + count

        List<Integer> list3 = Arrays.asList(5, 12, 7, 20, 5, 30);
        Map<Boolean, Long> result3 = list3.stream().collect(Collectors.partitioningBy(x -> x % 2 == 0, Collectors.counting()));
        System.out.println(result3);


        // problem - 6 find most frequent number
        int mostFrequent = list3.stream().collect(Collectors.groupingBy(x -> x, Collectors.counting())).entrySet().stream().max(Map.Entry.comparingByValue()).get().getKey();

//        System.out.println(mostFrequent);

        // problem - 7 remove duplicates + sort desc

        list3.stream().distinct().sorted((a, b) -> b - a).forEach(System.out::println);

        // problem - 8 complex backend pipeline

        int sum = orders.stream().filter(o -> o.getPrices().size() > 1).flatMap(o -> o.getPrices().stream()).filter(p -> p > 100).reduce(0, Integer::sum);
        System.out.println(sum);


        // problem - 9

        List<String> words = Arrays.asList("apple", "banana", "apple", "orange", "banana");
        Map<String, Long> freq = words.stream().collect(Collectors.groupingBy(w -> w, Collectors.counting()));
        System.out.println(freq);

        // problem - 10

        Map<String, Long> freq1 = words.stream().collect(Collectors.groupingBy(w -> w, Collectors.counting()));

        String mostFreq = freq1.entrySet()
                .stream()
                .max(Map.Entry.comparingByValue())
                .get().getKey();
        System.out.println(mostFreq);

        freq.entrySet()
                .stream()
                .sorted((a, b) -> b.getValue().compareTo(a.getValue()))
                .forEach(e -> System.out.println(e.getKey() + " -> " + e.getValue()));


        // problem - 11
        List<Integer> list4 = Arrays.asList(1, 1, 1, 2, 2, 3, 4, 4, 4, 4);
        Map<Integer, Long> mostFreqList = list4.stream()
                .collect(Collectors.groupingBy(w -> w, Collectors.counting()));
        System.out.println(mostFreqList);

        mostFreqList.entrySet()
                .stream()
                .sorted((a, b) -> b.getValue().compareTo(a.getValue()))
                .limit(2).map(Map.Entry::getKey).forEach(System.out::println);


        // problem - 12 Longest String

        List<String> words2 = Arrays.asList("apple", "banana", "kiwi", "strawberry");
        String longest = words2.stream()
                .max((a, b) -> a.length() - b.length())
                .get();
        String longest2 = words2.stream()
                .max(Comparator.comparing(String::length))
                .get();
        System.out.println(longest2);
        System.out.println(longest);

        // problem - 13 Flatten + Distinct + Sort

        List<List<Integer>> list5 = Arrays.asList(
                Arrays.asList(3, 1, 2),
                Arrays.asList(2, 4, 5),
                Arrays.asList(1, 6)
        );

        list5.stream()
                .flatMap(e -> e.stream())
                .distinct()
                .sorted()
                .forEach(x -> System.out.print(x));

        list5.stream()
                .flatMap(List::stream)
                .distinct()
                .sorted()
                .forEach(System.out::println);


        // problem - 14 Sum of Squares of Even
        List<Integer> list6 = Arrays.asList(1, 2, 3, 4, 5, 6);
        int evenSum = list6.stream()
                .filter(x -> x % 2 == 0)
                .map(x -> x * x)
                .reduce(0, Integer::sum);
        System.out.println(evenSum);

        // problem - 15 Group by First Letter
        Map<Character, List<String>> groupByLetter =
                words.stream()
                        .collect(Collectors.groupingBy(w -> w.charAt(0)));
        System.out.println(groupByLetter);

        // problem - 16 Check All Conditions
//        all numbers > 0
//        any number > 50
//        none negative

        boolean all = list4.stream().allMatch(x -> x > 0);
        boolean any = list4.stream().anyMatch(x -> x > 50);
        boolean none = list4.stream().noneMatch(x -> x < 0);

        // problem - 17 Convert List to Map
        // Convert list of users → Map<name, age>
        Map<String, Integer> usersMap = users.stream().collect(Collectors.toMap(u -> u.name, u -> u.age));
        System.out.println(usersMap);

        // problem - 18 Optional Handling
        int findFirst = list4.stream()
                .filter(x -> x > 100)
                .findFirst()
                .orElse(-1);
        System.out.println(findFirst);

        // Problem 19 — DTO Conversion

        class UserDTO {
            String name;
            UserDTO(String name) { this.name = name; }
        }

        List<UserDTO> userDto =
                users.stream()
                        .map(u -> new UserDTO(u.name))
                        .toList();
        System.out.println(userDto);

        // problem - 20
        List<String> wordsnew = Arrays.asList("apple", "banana", "kiwi", "grape", "apple");
        List<String> resultwithDistinct =
                wordsnew.stream()
                        .distinct()
                        .filter(x -> x.length() > 4)
                        .map(String::toUpperCase)
                        .sorted((a,b) -> b.compareTo(a))
                        .toList();
        System.out.println(resultwithDistinct);
    }
}

