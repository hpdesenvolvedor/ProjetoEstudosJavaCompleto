// Reference to a static method

package javacore.ZZClambdas.test;
import javacore.ZZClambdas.dominio.Anime;
import java.util.ArrayList;
import java.util.List;

public class MethodReferenceTest01 {
    public static void main(String[] args) {
        List<Anime> animeList = new ArrayList<>(List.of(new Anime("Pokemon", 43), new Anime("One piece", 10), new Anime("Power Rangers", 300)));
        animeList.sort((a1,a2) -> a1.getTitle().compareTo(a2.getTitle()));
        //animeList.sort(AnimeComparators::compareByTitle);
        //animeList.sort(AnimeComparators::compareByEpisodes);
        System.out.println(animeList);
    }
}
