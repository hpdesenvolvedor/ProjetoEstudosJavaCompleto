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

class MangaPrecoCompartor implements Comparator<Manga>{

    @Override
    public int compare(Manga o1, Manga o2) {
        return Double.compare(o1.getPreco(), o2.getPreco());
    }
}
public class NavigableSetTest01 {
    public static void main(String[] args) {
        NavigableSet<Smartphone> set = new TreeSet<>(new SmartphoneMarcaComparator());
        Smartphone smartphone = new Smartphone("123", "Nokia");
        set.add(smartphone);

        NavigableSet<Manga> mangas = new TreeSet<>(new MangaPrecoCompartor());
        mangas.add(new Manga(5L,"Pokemonn", 19.9,0));
        mangas.add(new Manga(1L,"Harry Potter",9.5,5));
        mangas.add(new Manga(4L,"X Man",3.2,0));
        mangas.add(new Manga(3L,"Sakura",11.20,2));
        mangas.add(new Manga(2L,"Dragon Ball Z",2.99,0));

        for (Manga manga : mangas) {
            System.out.println(manga);
        }

        Manga yudi = new Manga(21L, "Yudi Manga", 3.2, 5);

        // lower < - menor preço (comparado ao que passou)
        // floor <= - encontrou o valor e trouxe ele 3.2
        // higher > - encontra o maior
        //ceiling >= - maior ou igual

        System.out.println("---------------");
        System.out.println(mangas.lower(yudi));
        System.out.println(mangas.floor(yudi));
        System.out.println(mangas.higher(yudi));
        System.out.println(mangas.ceiling(yudi));

        // para retirar da lista no iniciou ou final
        System.out.println(mangas.size());
        System.out.println(mangas.pollFirst());
        System.out.println(mangas.pollLast());


    }
}
