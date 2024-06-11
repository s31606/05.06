public class Car implements Comparable<Car> {
    private String name;
    private int yearOfProduction;

    public Car(String name, int yearOfProduction) {
        this.name = name;
        this.yearOfProduction = yearOfProduction;
    }

    @Override
    public int compareTo(Car car) {
        return Integer.compare(this.yearOfProduction, car.yearOfProduction);
    }

    public String toString() {
        return "name: " + name + ", year: " + yearOfProduction;
    }
}