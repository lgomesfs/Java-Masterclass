public class Refrigerator extends homeAppliances {
    public void orderFood(){
        if (hasWorkToDo){
            System.out.println("Ordering food.");
            hasWorkToDo = false;
        }
    }
}
