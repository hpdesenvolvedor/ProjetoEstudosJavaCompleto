package javacore.Ycolecoes.test;

import javacore.Ycolecoes.dominio.Manga;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class InteratorTeste01{
    public static void main(String[] args) {

        List<Manga> mangas = new ArrayList<>(6);
        mangas.add(new Manga(5L,"Pokemonn", 19.9,0));
        mangas.add(new Manga(1L,"Harry Potter",9.5,5));
        mangas.add(new Manga(4L,"X Man",3.2,0));
        mangas.add(new Manga(3L,"Sakura",11.20,2));
        mangas.add(new Manga(2L,"Dragon Ball Z",2.99,0));

/*        Iterator<Manga> mangaIterator = mangas.iterator();
        while (mangaIterator.hasNext()){
            if (mangaIterator.next().getQuantidade() == 0){
                mangaIterator.remove();
            }
        }
 */

        System.out.println(mangas);

        mangas.removeIf(manga -> manga.getQuantidade() == 0);
}
}
