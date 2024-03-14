public class Main {
    public static void main(String[] args) {

        Account mainAccount = new Account("Leri", 9000);
        Account transferAccount = new Account("Giorgi", 20);

        System.out.println("---------------------------------");

        // BELOW WE WILL DISPLAY BALANCE OF BOTH ACCOUNTS
        mainAccount.displayCurrentBalance();
        transferAccount.displayCurrentBalance();

        System.out.println("---------------------------------");

        // BELOW MAIN-ACC WILL DEPOSIT 1K DOLLARS and WITHDRAW 200
        mainAccount.deposit(1000);
        mainAccount.displayCurrentBalance();
        mainAccount.withdraw(200);
        mainAccount.displayCurrentBalance();

        // BELOW MAIN-ACC WILL TRANSFER 9800 TO TRANSFER ACCOUNT


        mainAccount.transferMoney(mainAccount,transferAccount,9800);
        System.out.println("---------------------------------");

        mainAccount.displayCurrentBalance();
        transferAccount.displayCurrentBalance();


    }
}