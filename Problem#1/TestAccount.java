public class TestAccount {
    public static void main(String[] args) {
        // Created two accounts
        Account acc1 = new Account("A001", "Account 1", 5000);
        Account acc2 = new Account("A002", "Account 2", 4000);

        // Display initial balances
        System.out.println("\nInitial balances:");
        System.out.println("Account 1 balance: $" + acc1.getBalance());
        System.out.println("Account 2 balance: $" + acc2.getBalance());

        // Transfer $1000 from account 1 to account 2
        acc1.transferTo(acc2, 1000);

        // Display balances after transfer
        System.out.println("\nBalances after transfer:");
        System.out.println("Account 1 balance: $" + acc1.getBalance());
        System.out.println("Account 2 balance: $" + acc2.getBalance());
    }
}