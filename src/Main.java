public class Main {

    public static void main(String[] args) {

        BankAccount Account1 = new BankAccount("Ace", 500);
        BankAccount Account2 = new BankAccount("Tracy", 5000);
        BankAccount Account3 = new BankAccount("Mai", 300);
    
    Account1.deposits(100);
    Account1.acctInfo("" , 0);

    Account2.withdrew(100);
    Account2.acctInfo("" , 0);

    Account3.deposits(100);
    Account3.acctInfo("" , 0);
    }
}