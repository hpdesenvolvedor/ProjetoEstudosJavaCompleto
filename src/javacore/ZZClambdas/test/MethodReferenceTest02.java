//Reference to an instance method of a particular object
package javacore.ZZClambdas.test;

import javacore.ZZClambdas.dominio.Anime;
import javacore.ZZClambdas.dominio.service.AnimeComparators;

import java.util.ArrayList;
import java.util.List;

public class MethodReferenceTest02 {
    public static void main(String[] args) {
        AnimeComparators animeComparators = new AnimeComparators();
        List<Anime> animeList = new ArrayList<>(List.of(new Anime("Pokemon", 43), new Anime("One piece", 10), new Anime("Power Rangers", 300)));
        animeList.sort(animeComparators::compareByEpisodesNonStatic);
        System.out.println(animeList);
    }
}
