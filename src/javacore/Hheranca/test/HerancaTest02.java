package javacore.Hheranca.test;

import javacore.Hheranca.dominio.Funcionario;

public class HerancaTest02 {
    // 0 - Bloco de inicialização estático da super classe é executado quando a JVM carregar classe pai
    // 1 - Bloco de inicialização estático da subclasse é executado quando a JVM carregar classe filha
    // 2 - Alocado espaco em memoria pro objeto da superclasse pai
    // 3 - Cada atributo de superclasse é criado e inicializado com valores default/padroes ou o que for passado
    // 4 - Bloco de inicializacao da superclasse é executado na ordem que aparece
    // 5 - Contrutor é executado da superclasse é executado
    // 6 - Alocado espaço em memória pro objeto da subclasse
    // 7 - Cada atributo de subclasse é criado e inicializado com valores default/padroes ou o que for passado da subclasse
    // 8 - Bloco de inicializacao da subclasse é executado na ordem que aparece
    // 9 - Contrutor é executado da subrclasse
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario("Julietta");
    }
}
