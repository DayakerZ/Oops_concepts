class Mobile{

    public void call(){
        System.out.println("Calling");
    }
}
class Samsung extends Mobile{
    
    public void call(){
        System.out.println("Calling from Samsung");
    }
}



public class Overriding{
    public static void main(String[] args) {
        
        Mobile m = new Mobile();
        m.call();
        Samsung s = new Samsung();
        s.call();
        Mobile m1 = new Samsung();
        m1.call();
    }
}