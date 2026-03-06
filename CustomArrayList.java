import java.util.Arrays;

public class CustomArrayList<T extends Number> {

    private Object[] data;
    private static int DEFAULT_SIZE = 10;
    private int size = 0;


    public CustomArrayList() {
        this.data = new Object[DEFAULT_SIZE];
    }

    public void add(T num) {
        if (isFull()) {

            resize();
        }
        data[size++] = num;
    }

    private void resize() {
        Object[] temp = new Object[data.length * 2];
        System.arraycopy(data, 0, temp, 0, data.length);
        data = temp;

    }

    private boolean isFull() {
        return size == data.length;
    }

    public T get(int index){
        return (T)data[index];
    }

    public int getSize(){
        return size;
    }

    public void set(int index, int value){
        data[index] = value;
    }

    public T remove(){
        T removed = (T)data[--size];
        return removed;
    }

    @Override
    public String toString(){
        return   Arrays.toString(data);
    }
    public static void main(String[] args) {
        CustomArrayList<Integer> list = new CustomArrayList<>();
        list.add(12);
        System.out.println(list.getSize());
        System.out.println(list);
    }

}
