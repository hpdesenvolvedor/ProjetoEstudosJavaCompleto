package javacore.Aintroducaoclasses.teste;

import javacore.Aintroducaoclasses.dominio.Carro;

public class CarroTest01 {
    public static void main(String[] args) {
        Carro carro01 = new Carro();
        Carro carro02 = new Carro();


        carro01.nome = "Honda";
        carro01.modelo = "HRV";
        carro01.ano = 2021;

        carro02.nome = "Pegeot";
        carro02.modelo = "208";
        carro02.ano = 2024;

        System.out.println(carro01.nome);
        System.out.println(carro01.modelo);
        System.out.println(carro01.ano);

        System.out.println("--------------");

        System.out.println(carro02.nome);
        System.out.println(carro02.modelo);
        System.out.println(carro02.ano);


    }
}
