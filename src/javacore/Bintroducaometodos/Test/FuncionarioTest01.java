package javacore.Bintroducaometodos.Test;

import javacore.Bintroducaometodos.dominio.Funcionario;

public class FuncionarioTest01 {
    public static void main(String[] args) {

        Funcionario funcionario = new Funcionario();

        funcionario.setNome("Joao");
        funcionario.setIdade(23);
        funcionario.setSalarios(new double[]{1200, 987.32, 2000});

        funcionario.imprime();
        System.out.print("\nMédia "+ funcionario.getMedia());

    }
}
