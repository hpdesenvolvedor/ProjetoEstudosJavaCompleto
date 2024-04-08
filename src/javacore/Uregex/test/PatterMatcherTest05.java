package javacore.Uregex.test;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatterMatcherTest05 {
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
        // . Ex: 1.3 = 123, 133, 1@3, 1A3


        String regex = "([a-zA-Z0-9\\._-])+@([a-zA-Z])+(\\.([a-zA-Z])+)+";
        String texto = "luffy@gmail.com, 123yugui@hotmail.com, #@!naruto@gmail.com, teste@gmail.com.br, sakura@outlook.com";
        System.out.print("E-mail válido: ");
        System.out.println("#@!naruto@gmail.com".matches(regex));
        System.out.println(texto.split(",")[1].trim()); //o trim é para tirar os espaços em branco
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
