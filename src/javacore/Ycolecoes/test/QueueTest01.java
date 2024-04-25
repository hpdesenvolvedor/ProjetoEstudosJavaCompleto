package javacore.Ycolecoes.test;

import java.util.PriorityQueue;
import java.util.Queue;

public class QueueTest01 {
    public static void main(String[] args) {
        Queue<String> fila = new PriorityQueue<>();
        fila.add("D");
        fila.add("A");
        fila.add("C");
        fila.add("B");


        for (String prioridade : fila) {
            System.out.println(prioridade);
        }

    }
}
