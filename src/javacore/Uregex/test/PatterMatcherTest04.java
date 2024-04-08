package javacore.Uregex.test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatterMatcherTest04 {
    public static void main(String[] args) {
        // \d = todos os dígitos (numeros)
        // \D = todos o que não for dígito (letras)
        // \s = todos os espaços em branco /t /n /f /r
        // \S = todos os caracters excluindo os brancos
        // \w = aZ AZ, digitos, _
        // \W = tudo o que não for incluso no \w
        // []
        // ? Zero ou uma
        // * zero ou mais
        // + uma ou mais
        // {n,m} de n até m
        // ()
        // | o(v|c)o ovo | oco
        // $


        String regex = "0[xX]([0-9a-fA-F])+(\\s|$)";

        String texto = "12 0x 0x 0xFFABC 0x109 0x1";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(texto);
        System.out.println("texto:  "+texto);
        System.out.println("indice: 0123456789");
        System.out.println("regex:  "+regex);
        System.out.println("Posições encontradas");
        while (matcher.find()){
            System.out.print(matcher.start()+" "+ matcher.group()+"\n ");
        }

        //O Java para reconhecer um número hexadecimal tem que iniciar com 0x ou 0X
        int numeroHex = 0X900B0;


    }
}
