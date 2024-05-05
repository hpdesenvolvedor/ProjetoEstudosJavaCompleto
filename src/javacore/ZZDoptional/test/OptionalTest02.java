package javacore.ZZDoptional.test;


import javacore.ZZDoptional.dominio.Manga;
import javacore.ZZDoptional.repositorio.MangaRepository;

import java.util.Optional;

public class OptionalTest02 {
    public static void main(String[] args) throws IllegalAccessException {
        Optional<Manga> mangaByTitle = MangaRepository.findByTitle("Yu-Gi-Oh");
        mangaByTitle.ifPresent(m -> m.setTitle("Yu Gi Oh 2"));
        System.out.println(mangaByTitle);

        Manga mangaById = MangaRepository.findById(2)
                .orElseThrow(IllegalAccessException::new);

        System.out.println(mangaById);

        Manga newManga = MangaRepository.findByTitle("Sakura")
                .orElse(new Manga(4, "Sakura", 10));
        System.out.println(newManga);

    }
}
