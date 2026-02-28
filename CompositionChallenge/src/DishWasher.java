public class DishWasher extends homeAppliances{
    public void doDishes(){
        if(hasWorkToDo){
            System.out.println("Washing dishes");
            hasWorkToDo = false;
        }
    }
}
