package javacore.Ycolecoes.test;

import javacore.Ycolecoes.dominio.Manga;
import javacore.Ycolecoes.dominio.Smartphone;

import java.util.Comparator;
import java.util.NavigableSet;
import java.util.TreeSet;

class SmartphoneMarcaComparator implements Comparator<Smartphone>{

    @Override
    public int compare(Smartphone o1, Smartphone o2) {
        return o1.getMarca().compareTo(o2.getMarca());
    }
}
public class NavigableSetTest01 {
    public static void main(String[] args) {
        NavigableSet<Smartphone> set = new TreeSet<>(new SmartphoneMarcaComparator());
        Smartphone smartphone = new Smartphone("123", "Nokia");
        set.add(smartphone);

        NavigableSet<Manga> mangas = new TreeSet<>();
        mangas.add(new Manga(5L,"Pokemonn", 19.9,0));
        mangas.add(new Manga(1L,"Harry Potter",9.5,5));
        mangas.add(new Manga(4L,"X Man",3.2,0));
        mangas.add(new Manga(3L,"Sakura",11.20,2));
        mangas.add(new Manga(2L,"Dragon Ball Z",2.99,0));

        for (Manga manga : mangas) {
            System.out.println(manga);
        }

    }
}
