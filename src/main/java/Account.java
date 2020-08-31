public class Account {
    private String owner;
    private double balance;
    private int numberOfTransactions;

    public String getOwner() {
        return owner;
    }

    public double getBalance() {
        return balance;
    }

    public int getNumberOfTransactions() {
        return numberOfTransactions;
    }

    public Account() {
    }

    public Account(String owner, double balance, int numberOfTransactions) {
        this.owner = owner;
        this.balance = balance;
        this.numberOfTransactions = numberOfTransactions;
    }

    public void deposit(double depositAmount){
        this.balance += depositAmount;
        this.numberOfTransactions++;
        System.out.println("Deposit of " + depositAmount + "made. New Balance is " + this.balance);
    }

    public void withdrawal(double withdrawalAmount){
        if(this.balance - withdrawalAmount < 0 ){
            System.out.println("Only " + this.balance + " available. Withdrawal not processed");
        }else{
            this.balance -= withdrawalAmount;
            this.numberOfTransactions++;
            System.out.println("Withdrawal of " + withdrawalAmount + "processed. Remaining balance = " + this.balance);
        }
    }
}
