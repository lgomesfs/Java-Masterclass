public class SmartKitchen {
    private CoffeeMaker brewMaster;
    private DishWasher dishWasher;
    private Refrigerator iceBox;

    public SmartKitchen(){
        brewMaster = new CoffeeMaker();
        dishWasher = new DishWasher();
        iceBox = new Refrigerator();
    }

    private void addWater(){
        brewMaster.setHasWorkToDo(true);
    }
    private void pourMilk(){
        iceBox.setHasWorkToDo(true);
    }
    private void loadDishwasher(){
        dishWasher.setHasWorkToDo(true);
    }
    public void setKitchenState(boolean coffee, boolean dish, boolean ice){
        brewMaster.setHasWorkToDo(coffee);
        dishWasher.setHasWorkToDo(dish);
        iceBox.setHasWorkToDo(ice);

    }

    public void doKitchenWork(){
        brewMaster.brewCoffee();
        iceBox.orderFood();
        dishWasher.doDishes();
    }
}
