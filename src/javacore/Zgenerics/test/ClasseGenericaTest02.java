package javacore.Zgenerics.test;

import javacore.Zgenerics.dominio.Barco;
import javacore.Zgenerics.dominio.Carro;
import javacore.Zgenerics.service.BarcoRentavelService;
import javacore.Zgenerics.service.CarroRentavelService;

public class ClasseGenericaTest02 {
    public static void main(String[] args) {
        BarcoRentavelService barcoRentavelService = new BarcoRentavelService();
        Barco barco = barcoRentavelService.buscarBarcoDisponivel();
        System.out.println("Usando o barco por um mês...");
        barcoRentavelService.retornarBarcoAlugado(barco);
    }
}
