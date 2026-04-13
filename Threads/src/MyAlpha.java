public class MyAlpha implements Runnable {
    public void run(){
        for(char ch = 'A'; ch <= 'E'; ch++){
            System.out.println("Alphabet:" + ch);
            try {
                Thread.sleep(100);
            } catch (Exception e){}
        }
    }
}
