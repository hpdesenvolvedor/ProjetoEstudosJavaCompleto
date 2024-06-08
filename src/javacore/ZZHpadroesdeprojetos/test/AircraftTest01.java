package javacore.ZZHpadroesdeprojetos.test;

import javacore.ZZHpadroesdeprojetos.dominio.Aircraft;

public class AircraftTest01 {
    public static void main(String[] args) {
        bookSeat("1A");
    }

    private static void bookSeat(String seat){
        Aircraft aircraft = new Aircraft();
        System.out.println(aircraft.bookSeat(seat));
    }


}
