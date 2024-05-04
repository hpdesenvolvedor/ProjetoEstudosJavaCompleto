// Reference toa construtor

package javacore.ZZClambdas.test;

import javacore.ZZClambdas.dominio.Anime;
import javacore.ZZClambdas.dominio.service.AnimeComparators;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Supplier;

public class MethodReferenceTest04 {
    public static void main(String[] args) {
        Supplier<AnimeComparators> newAnimeComparator = AnimeComparators::new;
        AnimeComparators animeComparators = newAnimeComparator.get();
        List<Anime> animeList = new ArrayList<>(List.of(new Anime("Pokemon", 43), new Anime("One piece", 10), new Anime("Power Rangers", 300)));

        animeList.sort(animeComparators::compareByEpisodesNonStatic);
        System.out.println(animeList);

        BiFunction<String, Integer, Anime> animeFunction = (tittle, episodes) -> new Anime(tittle, episodes);
        BiFunction<String, Integer, Anime> animeFunction2 = Anime::new;
        System.out.println(animeFunction2.apply("Eudora", 20));
    }
}
