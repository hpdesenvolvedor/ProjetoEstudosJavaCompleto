package javacore.ZZHpadroesdeprojetos.test;

import javacore.ZZHpadroesdeprojetos.dominio.Pessoa;

public class BulderPatternTest01 {
    public static void main(String[] args) {
        Pessoa build = new Pessoa.PessoaPrincipal()
                .firstName("Henrique")
                .lastName("Paixao")
                .build();

        System.out.println(build);

    }
}
