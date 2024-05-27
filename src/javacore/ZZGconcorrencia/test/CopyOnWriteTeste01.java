package javacore.ZZGconcorrencia.test;


import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.TimeUnit;

public class CopyOnWriteTeste01 {
    public static void main(String[] args) {
        List<Integer> list = new CopyOnWriteArrayList<>();
        for (int i = 0; i < 2000; i++) {
            list.add(i);
        }
        Runnable runnableIterator = () -> {
            try {
                Iterator<Integer> iterator = list.iterator();
                TimeUnit.SECONDS.sleep(2);
                iterator.forEachRemaining(System.out::println);
            }catch (InterruptedException e){
                e.printStackTrace();
            }

        };
        Runnable runnableRemover = () -> {
            for (int i = 0; i < 500; i++) {
                System.out.printf("%s remove4d %d5n", Thread.currentThread().getName(), i);
            }
        };
        new Thread(runnableIterator).start();
        new Thread(runnableIterator).start();
        new Thread(runnableRemover).start();
    }
}
