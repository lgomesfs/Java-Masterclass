public class ElectricCar extends Car{
    private double avgKmPerCharge;
    private int batterySize;

    public ElectricCar(String description, double avgKmPerCharge, int batterySize) {
        super(description);
        this.avgKmPerCharge = avgKmPerCharge;
        this.batterySize = batterySize;
    }

    @Override
    public void StartEngine() {
        super.StartEngine();
        System.out.println("Your car is receiving the power of the Electricity with his " + batterySize +
                " amount of battery power");
    }
}
