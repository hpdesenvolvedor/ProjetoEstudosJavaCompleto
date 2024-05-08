package javacore.ZZEstreams.test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.stream.Stream;

public class StreamTest04 {
    public static void main(String[] args) {
        List<List<String>> dev = new ArrayList<>();
        List<String> graphicDesigner = List.of("Wildnei Suane", "Pedro Silva", "Sandy Loke");
        List<String> developer = List.of("Henrique Nunes", "Laurinha Silva", "Junior");
        List<String> students = List.of("Rafa", "Lucas", "Antony");
        dev.add(graphicDesigner);
        dev.add(developer);
        dev.add(students);
        for (List<String> listPeople : dev) {
            for (String person : listPeople) {
                System.out.println(person);
            }
        }
        dev.stream().flatMap(Collection::stream).forEach(System.out::println);


    }

}
