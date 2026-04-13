import java.util.concurrent.CompletableFuture;

public class Completablefuture {
    public static void main(String[] args) {
        CompletableFuture.supplyAsync(() -> {
                    System.out.println("Fetching user...");
                    return "Dev";
                })
                .thenApply(name -> {
                    System.out.println("Processing...");
                    return name.toUpperCase();
                })
                .thenAccept(result -> {
                    System.out.println("Final Result: " + result);
                });

        CompletableFuture<Integer> f1 = CompletableFuture.supplyAsync(()-> 10);
        CompletableFuture<Integer> f2 = CompletableFuture.supplyAsync(()-> 10);
        f1.thenCombine(f2, Integer::sum).thenAccept(System.out::println);
    }
}
