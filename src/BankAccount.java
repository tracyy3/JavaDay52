public class BankAccount {

    private String userName;
    private Double myAccountBalance;


    public BankAccount( String userName, double myAccountBalance) {
        this.userName = userName;
        this.myAccountBalance= myAccountBalance;
    }

    public void deposits(double amount) {
        this.myAccountBalance += amount;
        System.out.println("My account deposits " + amount + " balance: "+ this.myAccountBalance);
    }

    public void withdrew(double amount) {
        this.myAccountBalance -= amount;
        System.out.println("My account after " + amount + " withdrew balance: "+ this.myAccountBalance);
    }

    public void acctInfo(String accountName, double deposits){
        this.userName = userName;
        this.myAccountBalance = myAccountBalance;
        System.out.println(this.userName + "'s" + " account balance: " + this.myAccountBalance);
    }
}
