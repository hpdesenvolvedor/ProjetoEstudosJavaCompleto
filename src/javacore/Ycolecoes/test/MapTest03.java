package javacore.Ycolecoes.test;

import javacore.Ycolecoes.dominio.Consumidor;
import javacore.Ycolecoes.dominio.Manga;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapTest03 {
    public static void main(String[] args) {
        Consumidor consumidor1 = new Consumidor("Henrique Nunes");
        Consumidor consumidor2 = new Consumidor("HP Desenvolvedor");

        Manga manga1 = new Manga(5L, "Pokemonn", 19.9);
        Manga manga2 = new Manga(1L,"Harry Potter",9.5);
        Manga manga3 = new Manga(4L,"X Man",3.2);
        Manga manga4 = new Manga(3L,"Sakura",11.20);
        Manga manga5 = new Manga(2L,"Dragon Ball Z",2.99);

        List<Manga> mangaConsumidor1List = List.of(manga1, manga2, manga3);
        List<Manga> mangaConsumidor2List = List.of(manga3, manga4, manga5);
        Map<Consumidor, List<Manga>> consumidorMangaMap = new HashMap<>();
        consumidorMangaMap.put(consumidor1, mangaConsumidor1List);
        consumidorMangaMap.put(consumidor2, mangaConsumidor2List);

        for (Map.Entry<Consumidor, List<Manga>> entry: consumidorMangaMap.entrySet()) {
            System.out.println("--------"+entry.getKey().getNome()+" Comprou: ");
            for (Manga manga : entry.getValue()) {
                System.out.println(manga.getNome());
            }

        }






    }
}
