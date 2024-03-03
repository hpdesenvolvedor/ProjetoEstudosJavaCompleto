package javacore.Gassociacao.test;

import javacore.Gassociacao.dominio.Escola;
import javacore.Gassociacao.dominio.Professor;

public class EscolaTest01 {
    public static void main(String[] args) {
        Professor professor1 = new Professor("Túlio");
        Professor professor2= new Professor("Eliza");
        Professor[] professores = {professor1, professor2};
        Escola escola = new Escola("Auxiliadora", professores);

        escola.imprime();
    }
}
