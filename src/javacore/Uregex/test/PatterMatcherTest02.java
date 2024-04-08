package javacore.Uregex.test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatterMatcherTest02 {
    public static void main(String[] args) {
        // \d = todos os dígitos (numeros)
        // \D = todos o que não for dígito (letras)
        // \s = todos os espaços em branco /t /n /f /r
        // \S = todos os caracters excluindo os brancos
        // \w = aZ AZ, digitos, _
        // \W = tudo o que não for incluso no \w


        String regex = "\\d";
        String texto = "ab5314gwe";
        String texto2 = "abaabaa";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(texto);
        System.out.println("texto:  "+texto);
        System.out.println("indice: 0123456789");
        System.out.println("regex:  "+regex);
        System.out.println("Posições encontradas");
        while (matcher.find()){
            System.out.print(matcher.start()+" "+ matcher.group()+"\n ");
        }

    }
}
