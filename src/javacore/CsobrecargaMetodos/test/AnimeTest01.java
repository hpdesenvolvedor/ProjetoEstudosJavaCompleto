package javacore.CsobrecargaMetodos.test;

import javacore.CsobrecargaMetodos.dominio.Anime;

public class AnimeTest01 {
    public static void main(String[] args) {
        Anime anime = new Anime();
        anime.init("Yu-gi-oh", "TV", 12);
        anime.init("Yu-gi-oh", "TV", 12, "Fantasia e Ficcao Cientifica");


        anime.imprime();
    }
}
