package javacore.ZZFthreads.test;


class ThreadExampleRunnable2 implements  Runnable{
    private final String c;
    public ThreadExampleRunnable2(String c){
        this.c = c;
    }
    @Override
    public void run() {
        for (int i = 0; i < 500; i++) {
            System.out.print(c);
            if (i % 100 ==0){
                System.out.println();
            }
            Thread.yield();
        }
    }
}
// Daemon x User
public class ThreadsTest02 {
    public static void main(String[] args) {
        Thread t1 = new Thread(new ThreadExampleRunnable2("KA"));
        Thread t2 = new Thread(new ThreadExampleRunnable2("ME"));
        t1.start();
        t2.start();
    }
}