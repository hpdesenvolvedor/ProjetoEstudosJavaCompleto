package javacore.Gassociacao.test;

import javacore.Gassociacao.dominio.Jogador;
import javacore.Gassociacao.dominio.Time;

public class JogadorTest02 {
    public static void main(String[] args) {
        Jogador jogador1 = new Jogador("Pele");

        Time time = new Time("Flamengo");
        jogador1.setTime(time);
        jogador1.imprime();
    }
}
