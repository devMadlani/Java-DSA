//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

import java.util.concurrent.CompletableFuture;

public class Main {
    public static void main(String[] args) {
        Thread t1 = new Thread(new MyNumber());
        Thread t2 = new Thread(new MyAlpha());
        t1.start();
        t2.start();
    }
}