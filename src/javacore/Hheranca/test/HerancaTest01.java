package javacore.Hheranca.test;

import javacore.Hheranca.dominio.Endereco;
import javacore.Hheranca.dominio.Funcionario;
import javacore.Hheranca.dominio.Pessoa;

public class HerancaTest01 {
    public static void main(String[] args) {
        Endereco endereco = new Endereco();
        endereco.setRua("Rua 03");
        endereco.setCep("03312-209");
        Pessoa pessoa = new Pessoa();
        pessoa.setNome("Heloisa");
        pessoa.setCpf("002202020");
        pessoa.setEndereco(endereco);
        pessoa.imprime();
        Funcionario funcionario = new Funcionario();
        funcionario.setNome("Gabriel");
        funcionario.setCpf("123456");
        funcionario.setEndereco(endereco);
        funcionario.setSalario(20000);
        System.out.println("---------");

        funcionario.imprime();
    }
}
