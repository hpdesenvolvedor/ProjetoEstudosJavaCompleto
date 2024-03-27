package javacore.Qstring.test;

public class Stringtest01 {
    public static void main(String[] args) {
        String nome = "Henrique"; // String constant pool
        String nome2 = "Henrique";
        nome = nome.concat(" Nunes");
        System.out.println(nome);
        System.out.println(nome == nome2);

        String nome3 = new String("Henrique");
        System.out.println(nome2 == nome3);
        System.out.println(nome2 == nome3.intern());
    }

}
