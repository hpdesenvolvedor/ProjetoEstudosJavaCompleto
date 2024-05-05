package javacore.ZZDoptional.test;

import java.util.List;
import java.util.Optional;

public class OptionalTest01 {
    public static void main(String[] args) {
        Optional<String> n1 = Optional.of("Aqui está sendo incrível, quero muito mais");
        Optional<String> n2 = Optional.ofNullable(null);
        Optional<String> n3 = Optional.empty();

        System.out.println(n1);
        System.out.println(n2);
        System.out.println(n3);
        System.out.println("-----------------");

        Optional<String> nameOptional = findName("henrique");
        String empty = nameOptional.orElse("EMPTY");
        System.out.println(empty);

    }

    private static Optional<String> findName(String name){
        List<String> list = List.of("Henrique", "Nunes");
        int i = list.indexOf(name);
        if (i != -1){
            return Optional.of(list.get(i));
        }
        return Optional.empty();
    }
}
