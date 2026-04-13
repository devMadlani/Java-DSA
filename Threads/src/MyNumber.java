public class MyNumber implements Runnable{
    public void run(){
        for (int i = 1; i <= 5; i++) {
            System.out.println("Number" + i);
            try {
                Thread.sleep(100);
            } catch (Exception e){}
        }
    }
}


