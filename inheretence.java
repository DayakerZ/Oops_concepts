interface Z{

    public void show();
}
interface Y{

    public void show();
}
class A{
    int a = 10;
    public void show(){
        System.out.println("IN base class");
    }
}
class B extends A{

    public void show(){
        System.out.println("IN inhereted class");
    }
}
class C extends B{

        int a = 11;

}
class D extends B{

    public void showint(){
        System.out.println("a value is "+a);
    }
}
class E implements Z,Y{

    @Override
    public void show() {
        System.out.println("multiple inheretence achived");
        
    }
    

}


public class inheretence{

    public static void main(String[] args) {
        
        C e = new C();
        e.show();
        D d = new D();
        d.showint();
        E f = new E();
        f.show();
    }
}