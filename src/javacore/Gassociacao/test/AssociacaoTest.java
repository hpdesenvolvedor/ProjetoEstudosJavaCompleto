package javacore.Gassociacao.test;

import javacore.Gassociacao.dominio.Aluno;
import javacore.Gassociacao.dominio.Local;
import javacore.Gassociacao.dominio.Professor;
import javacore.Gassociacao.dominio.Seminario;

public class AssociacaoTest {
    public static void main(String[] args) {
        Local local = new Local("Rua da luz");
        Aluno aluno = new Aluno("Pedro", 18);
        Professor professor = new Professor("Joao", "Portugues");
        Aluno[] alunosParaSeminario = {aluno};
        Seminario seminario = new Seminario("Ciclo escolar", alunosParaSeminario, local);
        Seminario[] seminariosDisponiveis = {seminario};
        professor.setSeminarios(seminariosDisponiveis);
        professor.imprime();

    }
}
