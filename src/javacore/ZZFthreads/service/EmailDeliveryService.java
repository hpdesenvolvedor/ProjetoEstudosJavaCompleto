package javacore.ZZFthreads.service;

import javacore.ZZFthreads.dominio.Members;

import java.lang.management.ThreadInfo;

public class EmailDeliveryService implements Runnable{
    private final Members members;

    public EmailDeliveryService(Members members) {
        this.members = members;
    }

    @Override
    public void run() {
        String threadName = Thread.currentThread().getName();
        System.out.println(threadName + " starting to deliver emails...");
        while (members.isOpen() || members.pendingEmails() > 0){
            try {
                String email = members.retrieveEmail();
                if (email == null) continue;
                System.out.println(threadName + " enviando email para "+email);
                Thread.sleep(2000);
                System.out.println(threadName + " enviou emaill com sucesso para "+email);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Todos os emails foram enviados com sucesso!");
    }
}
