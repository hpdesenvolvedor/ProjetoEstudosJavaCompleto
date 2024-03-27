package javacore.Qstring.test;

public class StringBuilderTest01 {
    public static void main(String[] args) {
        String nome = "Henrique Nunes";
        nome.concat(" HPDesenvolvedor");
        nome.substring(0,3);
        System.out.println(nome);
        StringBuilder sb = new StringBuilder("Henrique Nunes");
        sb.append(" HPdev").append(" Acrescentando");
        sb.substring(0,2);
        sb.reverse();
        System.out.println(sb);

    }
}
