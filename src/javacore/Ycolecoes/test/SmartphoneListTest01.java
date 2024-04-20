package javacore.Ycolecoes.test;

import javacore.Ycolecoes.dominio.Smartphone;

import java.util.ArrayList;
import java.util.List;

public class SmartphoneListTest01 {
    public static void main(String[] args) {
        Smartphone s1 = new Smartphone("1A2B3C", "Iphone");
        Smartphone s2 = new Smartphone("33333", "Samsung");
        Smartphone s3 = new Smartphone("55555", "Motorola");
        List<Smartphone> smartphones = new ArrayList<>(6);
        smartphones.add(s1);
        smartphones.add(s2);
        smartphones.add(s3);
        for (Smartphone smartphone : smartphones) {
            System.out.println(smartphone);

        }
        Smartphone s4 = new Smartphone("55555", "Pixel");
        System.out.println(smartphones.contains(s4));
        int indexSmartphone4 = smartphones.indexOf(s4);
        System.out.println(indexSmartphone4);
        System.out.println(smartphones.get(indexSmartphone4));




    }
}
