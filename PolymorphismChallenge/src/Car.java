public class Car {
    private String description;

    public Car(String description) {
        this.description = description;
    }

    public void StartEngine(){
        System.out.println("The motor is on");
    }

    public void drive(){
        runEngine();
        System.out.println("The car is moving");
    }

    protected void runEngine(){
        String name = this.getClass().getSimpleName();
        System.out.println("Your car is getting powered, it's a " + name);
    }
}
