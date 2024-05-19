package javacore.ZZEstreams.test;

import javacore.ZZEstreams.dominio.Category;
import javacore.ZZEstreams.dominio.LightNovel;
import javacore.ZZEstreams.dominio.Promotion;

import java.util.*;
import java.util.stream.Collectors;

public class StreamTest14 {
    private static List<LightNovel> lightNovelList = new ArrayList<>(List.of(
            new LightNovel("Tensei Shittara", 8.99, Category.FANTASY),
            new LightNovel("Overlord", 3.99, Category.FANTASY),
            new LightNovel("Violet Evergarden", 5.99, Category.DRAMA),
            new LightNovel("No Game no Life", 2.99, Category.FANTASY),
            new LightNovel("Fullmetal Alchemist", 5.99, Category.FANTASY),
            new LightNovel("kumo desuga", 1.99, Category.FANTASY),
            new LightNovel("kumo desuga", 1.99, Category.FANTASY),
            new LightNovel("Monogatari", 4.00, Category.ROMANCE)
    ));
    public static void main(String[] args) {
        Map<Category, Long> collect = lightNovelList.stream().collect(Collectors.groupingBy(LightNovel::getCategory, Collectors.counting()));
        System.out.println(collect);
        Map<Category, Optional<LightNovel>> collect1 = lightNovelList.stream().collect(Collectors.groupingBy(LightNovel::getCategory, Collectors.maxBy(Comparator.comparing(LightNovel::getPrice))));
        System.out.println(collect1);
    }
}
