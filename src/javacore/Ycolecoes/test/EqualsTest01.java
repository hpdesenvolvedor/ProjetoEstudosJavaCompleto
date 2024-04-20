package javacore.Ycolecoes.test;

import javacore.Ycolecoes.dominio.Smartphone;

// EQUALS VERIFICANDO SE A REFERÊNCIA É IGUAL. CASO SEJA (TRUE) SE NÃO (FALSE)
public class EqualsTest01 {
    public static void main(String[] args) {
        Smartphone phone11 = new Smartphone("1A2B3C", "Iphone");
        Smartphone phone12 = new Smartphone("1A2B3C", "Iphone");

        Smartphone fusion = new Smartphone("1A2B3C", "Motorola");
        Smartphone s23 = new Smartphone("1A2B3C", "Samsung");

        System.out.println(phone11.equals(phone12) );
    }
}
