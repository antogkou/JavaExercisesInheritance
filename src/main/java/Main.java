public class Main {
    public static void main(String[] args) {
        Account testAccount = new Account(
                "Antonis",
                0.00,
                0);

        System.out.println("Account owner name is: " + testAccount.getOwner());
        testAccount.withdrawal(100.0);

        testAccount.deposit(50.00);
        testAccount.withdrawal(100.0);
        testAccount.deposit(51.0);
        testAccount.withdrawal(100.0);
        int transactions = testAccount.getNumberOfTransactions();
        System.out.println(transactions + " transactions in total");

        StoreAccount storeAccount = new StoreAccount(
                "Gkoutzamanis",
                1000,
                0,
                "Sherlocked Hats",
                "premium");

        storeAccount.changeCategory();
        System.out.println(storeAccount.getOwner());
        System.out.println(storeAccount.getAccountCategory());
    }
}
