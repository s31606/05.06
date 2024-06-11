import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        Car car1 = new Car("Audi Q7", 2021);
        Car car2 = new Car("Volvo XC60", 2020);
        Car car3 = new Car("Volkswagen Passat", 2007);
        Car car4 = new Car("BMW 3 Series", 2019);
        Car car5 = new Car("Tesla Y", 2024);
        Car car6 = new Car("Mazda 3", 2013);
        Car car7 = new Car("Honda Civic", 2005);
        Car car8 = new Car("Ford Focus", 2010);
        Car car9 = new Car("Porsche 911 Carrera", 2023);
        Car car10 = new Car("Toyota Corolla", 2002);

        ArrayList<Car> cars = new ArrayList<>();
        cars.add(car1);
        cars.add(car2);
        cars.add(car3);
        cars.add(car4);
        cars.add(car5);
        cars.add(car6);
        cars.add(car7);
        cars.add(car8);
        cars.add(car9);
        cars.add(car10);

        Collections.sort(cars);

        for (Car car : cars) {
            System.out.println(car);
        }
    }
}