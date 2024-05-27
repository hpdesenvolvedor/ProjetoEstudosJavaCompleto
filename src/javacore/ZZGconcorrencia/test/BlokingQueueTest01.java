package javacore.ZZGconcorrencia.test;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.TimeUnit;

public class BlokingQueueTest01 {
    public static void main(String[] args) throws InterruptedException {
        BlockingQueue<String> bq = new ArrayBlockingQueue<>(1);
        bq.put("Henrique");
        System.out.printf("%s added the value %s%n", Thread.currentThread().getName(), bq.peek());
        System.out.println("Trying to add another value");
        new Thread(new RemoveFromQueue(bq));
        bq.put("Nunes");
        System.out.printf("%s added the value %s%n", Thread.currentThread().getName(), bq.peek());
    }
    static class RemoveFromQueue implements Runnable {
        private final BlockingQueue<String> bq;

        public RemoveFromQueue(BlockingQueue<String> bq){
            this.bq = bq;
        }

        @Override
        public void run() {
            System.out.printf("%s going to sleep for 2s %n", Thread.currentThread().getName());
            try {
                TimeUnit.SECONDS.sleep(2);
                System.out.printf("%s remove value from queue %s%n", Thread.currentThread().getName(), bq.take());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
