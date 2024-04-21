package javacore.Ycolecoes.test;

import java.net.CookieHandler;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListSortTest01 {
    public static void main(String[] args) {
        List<String> mangas = new ArrayList<>(6);
        mangas.add("Pokemonn");
        mangas.add("Harry Potter");
        mangas.add("X Man");
        mangas.add("Sakura");
        mangas.add("Dragon Ball Z");

        Collections.sort(mangas);  // faz a organização/ordenado da lista

        List<Double> dinheiros = new ArrayList<>();
        dinheiros.add(100.21);
        dinheiros.add(23.98);
        dinheiros.add(21.21);
        dinheiros.add(98.10);

        Collections.sort(dinheiros);


        for (String series : mangas) {
            System.out.println(series);
        }

        System.out.println(dinheiros);

    }
}
