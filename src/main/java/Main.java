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

       // storeAccount.changeCategory();
        System.out.println(storeAccount.getOwner());
        System.out.println(storeAccount.getAccountCategory());

        // Task 2 (part 1)
        Product x1 = new Product(1, "Painting Picasso. Guernica", 100, 1000);
        Product x2 = new Product(2, "Painting Tsarouxis. NaftisA", 200, 2000);
        Product x4 = new Product(3, "Chair. Luis XV", 100, 1000);
        IStore simple = new SimpleRetailStore();
        simple.buy(x1);
        simple.buy(x4);
        simple.sell(x1);
        System.out.println(simple.getRevenue());

        // Task 2 (part 2)
        IStore invStore= new InventoryRetailStore();
        invStore.buy(x1);
        invStore.buy(x4);
        invStore.sell(x1);
        System.out.println(invStore.getRevenue());
        invStore.sell(x2);
        invStore.getInventory();
        //invStore.reset();
    }
}
