class Addition{

    public int sum(int a,int b){
        return a+b;
    }
    public double sum(int a,double b){
        return a+b;
    }
    public int sum(int a,int b,int c){
        return a+b+c;
    }
}



public class Overloading{

    public static void main(String[] args) {
        Addition add = new Addition();
        System.out.println(add.sum(2,3.0));
        System.out.println(add.sum(2,3,4));
    }
}