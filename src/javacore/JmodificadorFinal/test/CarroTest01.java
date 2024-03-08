package javacore.JmodificadorFinal.test;

import javacore.JmodificadorFinal.dominio.Carro;

import javacore.JmodificadorFinal.dominio.Comprador;


public class CarroTest01 {
    public static void main(String[] args) {
        Carro carro = new Carro();

        Comprador comprador2 = new Comprador();

        System.out.println(Carro.VELOCIDADE_LIMITE);
    }
}
