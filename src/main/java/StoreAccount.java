import java.util.Scanner;

public class StoreAccount extends Account {
    private String storeName;
    private String accountCategory;

    public void setAccountCategory(String accountCategory) {
        this.accountCategory = accountCategory;
    }

    public String getStoreName() {
        return storeName;
    }

    public String getAccountCategory() {
        return accountCategory;
    }



    public StoreAccount(String storeName, String accountCategory) {
        this.storeName = storeName;
        this.accountCategory = accountCategory;
    }

    public StoreAccount(String owner, double balance, int numberOfTransactions, String storeName, String accountCategory) {
        super(owner, balance, numberOfTransactions);
        this.storeName = storeName;
        this.accountCategory = accountCategory;
    }

    @Override
    public void deposit(double depositAmount) {
        super.deposit(depositAmount);
    }

    @Override
    public void withdrawal(double withdrawalAmount) {
        super.withdrawal(withdrawalAmount);
    }

    //TO BE FIXED
    public void changeCategory(){
        //this.accountCategory = category;
        System.out.println("Choose a new category: \n" +
                "1. basic\n" +
                "2. mid\n" +
                "3. extra\n" +
                "4. premium");
        int choice;
        try (Scanner scanner = new Scanner(System.in)) {
          choice = scanner.nextInt();
          if (choice == 1){
              this.accountCategory = "basic";
          }else if (choice == 2){
              this.accountCategory = "mid";
          }else if (choice == 3){
              this.accountCategory = "extra";
          }else if (choice == 4){
              this.accountCategory = "premium";
          }
        }
    }
}
