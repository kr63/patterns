package example;

import example.builders.CarBuilder;
import example.builders.CarManualBuilder;
import example.cars.Car;
import example.cars.Manual;
import example.director.Director;

public class Demo {
    public static void main(String[] args) {
        Director director = new Director();
        CarBuilder builder = new CarBuilder();
        director.constructSportsCar(builder);
        Car car = builder.getResults();
        System.out.println("Car built: " + car.getType());

        CarManualBuilder carManualBuilder = new CarManualBuilder();
        director.constructSportsCar(carManualBuilder);
        Manual carManual = carManualBuilder.getResult();
        System.out.println("\nCar manual built: " + carManual.print());
    }
}
