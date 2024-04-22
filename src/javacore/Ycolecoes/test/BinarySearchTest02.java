package javacore.Ycolecoes.test;

import javacore.Ycolecoes.dominio.Manga;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BinarySearchTest02 {
    public static void main(String[] args) {
        List<Manga> mangas = new ArrayList<>(6);
        mangas.add(new Manga(5L,"Pokemonn", 19.9));
        mangas.add(new Manga(1L,"Harry Potter",9.5));
        mangas.add(new Manga(4L,"X Man",3.2));
        mangas.add(new Manga(3L,"Sakura",11.20));
        mangas.add(new Manga(2L,"Dragon Ball Z",2.99));

        Collections.sort(mangas);
        for (Manga manga : mangas) {
            System.out.println(manga);
        }

       Manga mangaToSearch = new Manga(2L, "Dragon Ball Z", 2.99);
        System.out.println(Collections.binarySearch(mangas, mangaToSearch));


    }
}
