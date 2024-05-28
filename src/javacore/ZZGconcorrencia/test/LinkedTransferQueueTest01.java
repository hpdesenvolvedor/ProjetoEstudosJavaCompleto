package javacore.ZZGconcorrencia.test;

import java.util.concurrent.*;

public class LinkedTransferQueueTest01 {
    public static void main(String[] args) throws InterruptedException {
//      ConcurrentLinkedQueue, SynchronousQueue, LinkedBlockingQueue
        LinkedTransferQueue<Object> tq = new LinkedTransferQueue<>();
        System.out.println(tq.add("Henrique"));
        System.out.println(tq.remainingCapacity());
        System.out.println(tq.offer("Henrique"));
        System.out.println(tq.offer("Henrique", 10, TimeUnit.SECONDS));
        tq.put("Nunes");
        if (tq.hasWaitingConsumer()){
            tq.transfer("Nunes");
        }
        System.out.println(tq.tryTransfer("Paixao", 3, TimeUnit.SECONDS));
        System.out.println(tq.element());
        System.out.println(tq.poll());
        System.out.println(tq.remove());
        System.out.println(tq.take());
        System.out.println(tq.remainingCapacity());
    }
}
