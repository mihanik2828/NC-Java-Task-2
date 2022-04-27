package src.ch3.Task9.Greeter.java;

public class Greeter implements Runnable{
    private String target;
    private int n;

    @Override
    public void run() {
        for(int i=0;i<n;i++)
            System.out.println("Hello, "+target);
    }

    public Greeter(String target, int n) {
        this.target = target;
        this.n = n;
    }

    public static void main(String[] args) {
        Runnable runnable1 = new Greeter("world",5);
        Runnable runnable2 = new Greeter("word",4);

        Thread thread1 = new Thread(runnable1);
        Thread thread2 = new Thread(runnable2);

        thread1.start();
        thread2.start();

    }
}
