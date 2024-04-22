package javacore.Ycolecoes.test;

import javacore.Ycolecoes.dominio.Manga;

import java.util.HashSet;
import java.util.Set;
import java.util.stream.Stream;

public class SetTest01 {
    public static void main(String[] args) {
        Set<Manga> mangas = new HashSet<>();
        mangas.add(new Manga(5L,"Pokemonn", 19.9,0));
        mangas.add(new Manga(1L,"Harry Potter",9.5,5));
        mangas.add(new Manga(4L,"X Man",3.2,0));
        mangas.add(new Manga(3L,"Sakura",11.20,2));
        mangas.add(new Manga(2L,"Dragon Ball Z",2.99,0));


        for (Manga manga:mangas) {
            System.out.println(manga);
        }
    }
}
