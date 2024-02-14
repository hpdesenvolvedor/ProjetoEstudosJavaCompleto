package javacore.Bintroducaometodos.Test;

import javacore.Bintroducaometodos.dominio.Estudante;
import javacore.Bintroducaometodos.dominio.ImpressoraEstudante;

public class EstudanteTest01 {
    public static void main(String[] args) {
        Estudante estudante01 = new Estudante();
        Estudante estudante02 = new Estudante();
        ImpressoraEstudante impressoa = new ImpressoraEstudante();

        estudante01.nome = "Sakura";
        estudante01.idade = 15;
        estudante01.sexo = 'F';


        estudante02.nome = "Junior";
        estudante02.idade = 20;
        estudante02.sexo = 'M';

        impressoa.imprime(estudante01);
        impressoa.imprime(estudante02);
        impressoa.imprime(estudante02);




    }
}
