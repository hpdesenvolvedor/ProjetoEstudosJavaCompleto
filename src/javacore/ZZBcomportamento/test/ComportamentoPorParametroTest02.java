package javacore.ZZBcomportamento.test;

import javacore.ZZBcomportamento.dominio.Car;
import javacore.ZZBcomportamento.interfaces.CarPredicate;

import java.util.ArrayList;
import java.util.List;

public class ComportamentoPorParametroTest02 {

    private static List<Car> cars = List.of(new Car("green", 2011), new Car("black", 1998), new Car("red",2019));

    public static void main(String[] args) {
        List<Car> greenCars = filter(cars, car -> car.getColor().equals("green"));
        List<Car> redCars = filter(cars, car -> car.getColor().equals("red"));
        List<Car> yearCars = filter(cars, car -> car.getYear() < 1990);
        System.out.println(greenCars);
        System.out.println(redCars);
    }
    private static List<Car> filter(List<Car> cars, CarPredicate carPredicate){
        List<Car> filterCar = new ArrayList<>();
        for (Car car : cars) {
            if (carPredicate.teste(car)){
                filterCar.add(car);
            }
        }
        return filterCar;

    }

}
