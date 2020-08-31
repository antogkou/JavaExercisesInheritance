import org.w3c.dom.ls.LSOutput;

public class Main {
    public static void main(String[] args) {
        Account testAccount = new Account(
                "Antonis",
                10.00,
                0);

        System.out.println(testAccount.getOwner());
    }
}
