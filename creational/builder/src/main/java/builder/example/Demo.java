package builder.example;

import builder.example.builders.CarBuilder;
import builder.example.builders.CarManualBuilder;
import builder.example.cars.Car;
import builder.example.cars.Manual;
import builder.example.director.Director;

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
