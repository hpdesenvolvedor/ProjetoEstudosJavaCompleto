// Reference to an instance method of an arbitrary of a particular type
package javacore.ZZClambdas.test;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiPredicate;
import java.util.function.Function;

public class MethodReferenceTest03 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>(List.of("Vexana", "Eudora", "Layla"));
        list.sort(String::compareTo);
        System.out.println(list);
        Function<String, Integer> numStringToInteger = Integer::parseInt;
        System.out.println(numStringToInteger.apply("10"));

        BiPredicate<List<String>, String> checkName = List::contains;
        System.out.println(checkName.test(list, "Vexana"));
    }

}
