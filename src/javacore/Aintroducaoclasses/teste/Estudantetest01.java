package javacore.Aintroducaoclasses.teste;

import javacore.Aintroducaoclasses.dominio.Estudante;

public class Estudantetest01 {
    public static void main(String[] args) {
        Estudante estudante = new Estudante();
        estudante.nome = "Pedro";
        estudante.idade = 32;
        estudante.sexo = 'M';
        System.out.println(estudante.nome);
    }
}
