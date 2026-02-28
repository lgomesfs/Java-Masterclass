public class GasPoweredCar extends Car {
    private double avgKmPerLitre;
    private int cylinders;

    public GasPoweredCar(String description, int cylinders, double avgKmPerLitre) {
        super(description);
        this.cylinders = cylinders;
        this.avgKmPerLitre = avgKmPerLitre;
    }

    @Override
    public void StartEngine() {
        super.StartEngine();
        System.out.println("Your car is receiving the power of the Gas with his " + cylinders +
                " cylinders of power");
    }
}
