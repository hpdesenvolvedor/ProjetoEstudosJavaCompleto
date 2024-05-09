package javacore.ZZEstreams.test;

import javacore.ZZEstreams.dominio.LightNovel;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class StreamTest06 {
    private static List<LightNovel> lightNovelList = new ArrayList<>(List.of(
            new LightNovel("Tensei Shittara", 8.99),
            new LightNovel("Overlord", 3.99),
            new LightNovel("Violet Evergarden", 5.99),
            new LightNovel("No Game no Life", 2.99),
            new LightNovel("Fullmetal Alchemist", 5.99),
            new LightNovel("kumo desuga", 1.99),
            new LightNovel("kumo desuga", 1.99),
            new LightNovel("Monogatari", 4.00)
    ));

    public static void main(String[] args) {
        System.out.println(lightNovelList.stream().anyMatch(ln->ln.getPrice() > 8));
        System.out.println(lightNovelList.stream().noneMatch(ln->ln.getPrice() < 0));
        lightNovelList.stream()
                .filter(lightNovel -> lightNovel.getPrice() > 3)
                .max(Comparator.comparing(LightNovel::getPrice).reversed())
                .ifPresent(System.out::println);
    }

}
