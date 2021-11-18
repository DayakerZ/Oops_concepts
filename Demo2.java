//variables and methods
class Fan2{
    private static final String config ="2amp and 240V";
    private boolean isOn;
    private int fCountNo;
    Fan2(){
        System.out.println("Fan2 object created with count number 1");
    }

    Fan2(int fCountNo){
        this.fCountNo = fCountNo;
        System.out.println("Fan2 object created with count number"+fCountNo);
    }

    public void turnOn(){
        if(isOn == true) 
            return;
        else
            isOn = true;
    }

    public void turnOff(){
        if(isOn == false) 
            return;
        else
            isOn = false;
    }

    public void fanState() {

        String fName = "Fan2";
        if(isOn ==  true) 
            System.out.println(fName+" With "+fCountNo+" fancount is on and running");
        else 
            System.out.println(fName+" With "+fCountNo+" fancount is off and still");
    }
    static void config(){
        System.out.println(config);
    }
}

public class Demo2{

    public static void main(String[] args){

        Fan2 f1 = new Fan2();
        Fan2 f2 = new Fan2(2);
        Fan2.config();
        f1.turnOn();
        f1.fanState();
        f1.turnOff();
        f1.fanState();
        f2.turnOn();
        f2.fanState();
        f2.turnOn();
        f2.fanState();

    }
}