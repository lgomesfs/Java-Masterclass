public class CoffeeMaker extends homeAppliances{
    public void brewCoffee(){
        if (hasWorkToDo){
            System.out.println("Brewing coffee");
            hasWorkToDo = false;
        }
    }
}
