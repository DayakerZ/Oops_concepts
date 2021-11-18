//Classes and objects
class Fan{

    private boolean isOn;
    
    public void turnOn(){
        isOn = true;
    }
    public void turnOff(){
        isOn = false;
    }
    public void fanState()
    {
        if(isOn ==  true) System.out.println("The fan is on and running");
        else System.out.println("The fan is off and sill");
    }
}

public class Demo1{

    public static void main(String[] args){

        Fan f1 = new Fan();
        f1.turnOn();
        f1.fanState();
        f1.turnOff();
        f1.fanState();

    }
}