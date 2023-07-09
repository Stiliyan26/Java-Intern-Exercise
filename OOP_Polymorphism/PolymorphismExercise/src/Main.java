public class Main {
    public static void main(String[] args) {
        Car car = new Car("2022 nissan murano");
        runRace(car);

        Car ferrari = new GasPoweredCar("G-class mercedes AMG",
                15.4, 6);
        runRace(ferrari);
    }

    public static void runRace(Car car) {
        car.startEngine();
        car.drive();
        car.runEngine();
    }
}
