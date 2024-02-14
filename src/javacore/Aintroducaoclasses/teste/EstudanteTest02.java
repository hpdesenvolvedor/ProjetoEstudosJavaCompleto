package javacore.Aintroducaoclasses.teste;

import javacore.Aintroducaoclasses.dominio.Estudante;

public class EstudanteTest02 {
    public static void main(String[] args) {
        Estudante estudante = new Estudante();
        estudante.nome = "Henrique";
        estudante.idade = 25;
        estudante.sexo = 'M';

        System.out.println(estudante.nome);
    }
}
