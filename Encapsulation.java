class Account{

    private double balance;

    public double getBalance(){

        return balance;
    }
    public void setBalance(double balance){

        this.balance = balance;
    }
}




public class Encapsulation{

    public static void main(String[] args) {
        
        Account a = new Account();
        a.setBalance(43850.66);
        System.out.println(a.getBalance());
    }
}