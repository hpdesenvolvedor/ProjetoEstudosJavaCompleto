package javacore.Aintroducaoclasses.teste;

import javacore.Aintroducaoclasses.dominio.Professor;

public class ProfessorTest01 {
    public static void main(String[] args) {
        Professor professor = new Professor();

        professor.nome = "Henrique";
        professor.idade = 40;
        professor.sexo = 'M';

        System.out.println("Seu nome é "+ professor.nome + " Idade: " +professor.idade + " Seu sexo é: "+professor.sexo);
    }
}
