//Conversão de List para Arrays

package javacore.Ycolecoes.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListaArrayConversaoTest01 {
    public static void main(String[] args) {
        List<Integer> numeros = new ArrayList<>();
        numeros.add(1);
        numeros.add(2);
        numeros.add(3);
        numeros.add(4);
        Integer[] listToArray = numeros.toArray((new  Integer[0]));
        System.out.println(Arrays.toString((listToArray)));
        System.out.println("-------------------");

        Integer[] numeroArrays = new Integer[3];
        numeroArrays[0] = 1;
        numeroArrays[1] = 2;
        numeroArrays[2] = 3;

        List<Integer> arraystoList = Arrays.asList(numeroArrays);
        arraystoList.set(0,12);

        System.out.println(Arrays.toString(numeroArrays));
        System.out.println(arraystoList);

        System.out.println("---------------");
        List<Integer> numerosList = new ArrayList<>(Arrays.asList(numeroArrays));
        numerosList.add(15);
        System.out.println(numerosList);

    }
}
