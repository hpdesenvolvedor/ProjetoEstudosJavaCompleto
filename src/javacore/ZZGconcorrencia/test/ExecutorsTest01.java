package javacore.ZZGconcorrencia.test;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

class Printer implements Runnable{
    private int num;

    public Printer(int num) {
        this.num = num;
    }

    @Override
    public void run() {
        System.out.printf("%s inicio %s%n", Thread.currentThread().getName(), num);
        try {
            TimeUnit.SECONDS.sleep(3);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.printf("%s finalizou %n", Thread.currentThread().getName());
    }
}
public class ExecutorsTest01 {
    public static void main(String[] args) {

        ExecutorService executorService = Executors.newFixedThreadPool(4);
        executorService.execute(new Printer(1));
        executorService.execute(new Printer(2));
        executorService.execute(new Printer(3));
        executorService.execute(new Printer(4));
        executorService.shutdown();
        System.out.println("Programa finalizado");
    }
}
