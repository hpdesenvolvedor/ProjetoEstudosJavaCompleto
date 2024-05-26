package javacore.ZZGconcorrencia.test;



import javacore.ZZGconcorrencia.dominio.Members;
import javacore.ZZGconcorrencia.service.EmailDeliveryService;

import javax.swing.*;

public class EmailDeliveryTest01 {
    public static void main(String[] args) {
        Members members = new Members();
        Thread henrique = new Thread(new EmailDeliveryService(members), "Henrique");
        Thread guto = new Thread(new EmailDeliveryService(members), "Guto");
        henrique.start();
        guto.start();
        while (true){
            String email = JOptionPane.showInputDialog("Entre com seu email");
            if (email == null || email.isEmpty()){
                members.close();
                break;
            }
            members.addMemberEmail(email);


        }
    }
}
