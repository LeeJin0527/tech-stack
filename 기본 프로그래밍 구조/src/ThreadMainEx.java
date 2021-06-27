package Thread;

public class ThreadMainEx {
    public static void main(String[] args){
        long id = Thread.currentThread().getId();
        String name = Thread.currentThread().getName();
        int priority = Thread.currentThread().getPriority();
        Thread.State s = Thread.currentThread().getState();
        System.out.println(id);
        System.out.println(name);
        System.out.println(priority);
        System.out.println(s);

    }
}
