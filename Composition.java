class House{

    private Kitchen kitchen;
    public House(){
    
        kitchen = new Kitchen();
        kitchen.setFood("Chicken");
    }
    public String getFood(){

        return kitchen.getFood();
    }
}
class Kitchen{

    private String food;
    public void setFood(String food){

        this.food = food;
    }
    public String getFood(){

        return food;
    }
}

public class Composition{
    public static void main(String[] args) {
        
        House h = new House();
        System.out.println(h.getFood()); 

    }
}