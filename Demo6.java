//Data hiding
class AccessAccount{
    private double balance = 278911;
    private String username = "Dayaker";
    private String password = "12345679D";
    public double getBankbalance(String user,String pass){
        if(username.equals(user) && password.equals(pass)){
            return balance;
        }
        return -1;
    }
}
public class Demo6{

    public static void main(String[] args) {
    
        AccessAccount acc = new AccessAccount();
        double bal = acc.getBankbalance("Dayaker","12345679D");
        System.out.println(bal);
    }
}