package javacore.Eblocosdeinicializacao.test;

import javacore.Eblocosdeinicializacao.domain.Anime;

public class AnimeTest01 {
    public static void main(String[] args) {
        Anime anime = new Anime("One Piece");
        System.out.println(anime.getEpisodios());
    }
}
