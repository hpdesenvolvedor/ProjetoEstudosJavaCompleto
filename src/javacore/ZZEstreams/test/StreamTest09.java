package javacore.ZZEstreams.test;

import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamTest09 {
    public static void main(String[] args) {
        IntStream.rangeClosed(1,50).filter(n -> n % 2 == 0).forEach(n -> System.out.println(n+" "));
        System.out.println();
        IntStream.range(1,50).filter(n -> n % 2 == 0).forEach(n -> System.out.println(n +" "));
        System.out.println();

        Stream.of("Eleven ", "O ", "Cosmo ", "no seu coração")
                .map(String::toUpperCase)
                .forEach(s -> System.out.println(s +" "));

    }
}
