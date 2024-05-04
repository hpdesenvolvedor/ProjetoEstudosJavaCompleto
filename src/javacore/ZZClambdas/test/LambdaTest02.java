package javacore.ZZClambdas.test;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class LambdaTest02 {
    public static void main(String[] args) {
        List<String> strings = List.of("Eudora", "Harley");
        List<Integer> integers = map(strings, (String s) -> s.length());
        List<String> nomeMaiusculos = map(strings, (String n) -> n.toUpperCase());
        List<String> nomeMinusculo = map(strings, (String m) -> m.toLowerCase());
        System.out.println(integers);
        System.out.println(nomeMaiusculos);
        System.out.println(nomeMinusculo);
    }
    private static <T, R>List<R> map(List<T> list, Function<T, R> function){
        List<R> result = new ArrayList<>();
        for (T e: list){
            R r = function.apply(e);
            result.add(r);
        }
        return result;
    }
}
