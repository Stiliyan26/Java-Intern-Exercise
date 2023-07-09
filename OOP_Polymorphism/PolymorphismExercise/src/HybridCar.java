public class HybridCar extends Car {
    private double avgKmPerLitre;
    private int batterySize;
    private int clylinders;

    public HybridCar(String description, double avgKmPerLitre, int batterySize, int clylinders) {
        super(description);
        this.avgKmPerLitre = avgKmPerLitre;
        this.batterySize = batterySize;
        this.clylinders = clylinders;
    }
}
