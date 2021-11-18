interface Mobilee{

    public void call();

    public void endCall();

}
class Mi implements Mobilee{

    @Override
    public void call() {
        
        System.out.println("Calling ..");
    }

    @Override
    public void endCall() {
        System.out.println("Call ended");
        
    }


}

public class Abstraction{
    public static void main(String[] args) {
        
        Mi myMi = new Mi();
        myMi.call();
        myMi.endCall();
        Poco p = new Poco();
        p.call();
        p.endCall();
    }
}

abstract class Mob{

    public abstract void call();

    public void endCall(){

        System.out.println("end Call");
    }


}

class Poco extends Mob{

    @Override
    public void call() {
       
        System.out.println("Calling...");
    }
    
}