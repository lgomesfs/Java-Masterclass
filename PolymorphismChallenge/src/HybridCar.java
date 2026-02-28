public class HybridCar extends Car{
    private double avgKmPerLitre;
    private int batterySize;
    private int cylinders;

    public HybridCar(String description, double avgKmPerLitre, int batterySize, int cylinders) {
        super(description);
        this.avgKmPerLitre = avgKmPerLitre;
        this.batterySize = batterySize;
        this.cylinders = cylinders;
    }

    @Override
    public void StartEngine() {
        super.StartEngine();
        System.out.println("Your car is receiving the power of the Fuel and Electricity with his " +
                cylinders +
                " cylinders of power and " + batterySize + " amount of battery of Devil");
    }
}
