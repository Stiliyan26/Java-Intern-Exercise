public class GasPoweredCar extends Car {
    private double avgKmPerLitre;
    private int clinders;

    public GasPoweredCar(String description) {
        super(description);
    }

    public GasPoweredCar(String description, double avgKmPerLitre, int clinders) {
        super(description);
        this.avgKmPerLitre = avgKmPerLitre;
        this.clinders = clinders;
    }

    @Override
    public void startEngine() {
        System.out.printf("Gas -> All %d cylinders are fired up," +
                " Readay! %n", clinders);
    }

    @Override
    protected void runEngine() {
        System.out.printf("Gas -> usage excedes the average %.2f %n",
                avgKmPerLitre);
    }
}
