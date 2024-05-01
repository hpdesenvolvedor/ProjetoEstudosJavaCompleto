package javacore.Zgenerics.test;

import javacore.Zgenerics.dominio.Barco;
import javacore.Zgenerics.dominio.Carro;

import java.util.ArrayList;
import java.util.List;

public class MetodoGenericoTest01 {
    public static void main(String[] args) {
        criarArrayComUmObjeto(new Barco("Canoa"));

    }
    private static <T> void criarArrayComUmObjeto(T t){
        List<T> list = new ArrayList<>();
        list.add(t);
        System.out.println(list);
    }

}

