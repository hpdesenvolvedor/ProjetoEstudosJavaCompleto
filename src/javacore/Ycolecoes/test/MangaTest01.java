package javacore.Ycolecoes.test;

import javacore.Ycolecoes.dominio.Manga;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class MangaByIdComparator implements Comparator<Manga>{

    @Override
    public int compare(Manga manga1, Manga manga2) {
        return manga1.getId().compareTo(manga2.getId());
    }
}

public class MangaTest01 {
    public static void main(String[] args) {

        List<Manga> mangas = new ArrayList<>(6);
        mangas.add(new Manga(5L,"Pokemonn", 19.9));
        mangas.add(new Manga(1L,"Harry Potter",9.5));
        mangas.add(new Manga(4L,"X Man",3.2));
        mangas.add(new Manga(3L,"Sakura",11.20));
        mangas.add(new Manga(2L,"Dragon Ball Z",2.99));

        for (Manga manga : mangas) {
            System.out.println(manga);
        }

        System.out.println("--------------");

        Collections.sort(mangas);  // Valor ordenado por ID

        for (Manga manga : mangas) {
            System.out.println(manga);
        }

        System.out.println("--------------");

        Collections.sort(mangas, new MangaByIdComparator());

        for (Manga manga : mangas) {
            System.out.println(manga);
        }


    }
}
