interface example {

    static final String s = "static and final variable";

    public void meth0();

    public static void meth1(){

        System.out.println("this is public static method");
        //meth2();
    }
    private static void meth2(){

        System.out.println("this is private static method and can be accessed by default method and static method");
        //meth1();
    }
    private void meth4(){

        System.out.println("this is private method");
    }
    default void meth3(){
        System.out.println("this is default method");
        meth2();
        meth1();
        meth4();
    }

}
public class Demo7 implements example{

    public void meth0(){

        System.out.println("this is normal public method");
    }

    public static void main(String[] args) {
        
        Demo7 d = new Demo7();
        d.meth0();
        example.meth1();
        d.meth3();
    }
 
}