// MAP - K é a chave e V o valor
package javacore.Ycolecoes.test;

import java.util.HashMap;
import java.util.Map;

public class MapTest01 {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();  //para manter a ordem no lugar de HasMap colocar LinkedHashMap<>
        map.put("teklado", "teclado");
        map.put("mouze", "mouse");
        map.put("vc", "você");
        map.putIfAbsent("vc", "você2"); //ele só adiciona caso não exista
        System.out.println(map);
        for (String key : map.keySet()) {
            System.out.println(key + " : "+map.get(key));
        }

        System.out.println("---------");

        for (String value : map.values()){      //value para os valores
            System.out.println(value);
        }
    }
}
