package javacore.Uregex.test;

public class ScannerTest01 {
    public static void main(String[] args) {
        String texto = "Pedro, Caio, Leo";
        String[] nomes = texto.split(",");
        for (String nome : nomes) {
            System.out.println(nome.trim());

        String empresas = "Vivo, Itau, B3";
        String[] nomes2 = empresas.split(",");
            for (String s2 : nomes2) {
                System.out.println(s2.trim());
            }

        }

    }
}
