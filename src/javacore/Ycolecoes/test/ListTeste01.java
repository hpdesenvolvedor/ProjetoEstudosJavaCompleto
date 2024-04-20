package javacore.Ycolecoes.test;

import java.util.ArrayList;
import java.util.List;

public class ListTeste01 {
    public static void main(String[] args) {
        List<String> listNomes = new ArrayList<>(16);
        listNomes.add("Henrique");
        listNomes.add("Nunes");

        for (String nomes : listNomes) {
            System.out.println(nomes);
        }
        listNomes.add("Paixao");

        System.out.println("----------");
        for (int i = 0; i < listNomes.size(); i++) {
            System.out.println(listNomes.get(i));
        }










        // negreiros, formosa, carrefour

        List<String> listComercio = new ArrayList<>();
        List<String> listComercio2 = new ArrayList<>();
        listComercio.add("Negreiros");
        listComercio.add("Formosa");
        listComercio2.add("Carrefor");

        listComercio.addAll(listComercio2);


        for (String listaComercial : listComercio) {
            System.out.println(listaComercial);
        }

            System.out.println("_---------");

        int size = listNomes.size();
        for (int i = 0; i < size; i++) {
           System.out.println(listComercio.get(i));

        }

        List<Integer> numeros = new ArrayList<>();
        numeros.add(1);

    }

}
