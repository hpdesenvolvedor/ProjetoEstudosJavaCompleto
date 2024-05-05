package javacore.ZZDoptional.repositorio;

import javacore.ZZDoptional.dominio.Manga;

import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;

public class MangaRepository {
    private static List<Manga> mangas = List.of(new Manga(1, "Jack", 50), new Manga(2, "Anjos da Noite", 30), new Manga(3, "Yu-Gi-Oh", 30));

    public static Optional<Manga> findById(Integer id){
        return findBy(m -> m.getId().equals(id));
    }

    public static Optional<Manga> findByTitle(String title){
        return findBy(m -> m.getTitle().equals(title));
    }
    private static Optional<Manga> findBy(Predicate<Manga> predicate){
        Manga found = null;
        for (Manga manga : mangas){
            if (predicate.test(manga)){
                found = manga;
            }
        }
        return Optional.ofNullable(found);
    }
}
