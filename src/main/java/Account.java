public class Account {
    private String owner;
    private double balance;
    private int numberOfTransactions;

    public Account() {
    }

    public Account(String owner, double balance, int numberOfTransactions) {
        this.owner = owner;
        this.balance = balance;
        this.numberOfTransactions = numberOfTransactions;
    }
}
