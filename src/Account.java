
public class Account {

    private String name;
    private double balance = 0.0;

    public Account(String name, double balance) {
        this.name = name;
        this.balance = balance;
    }


    //deposit and display the balance after deposit methods :)
    public void deposit(double amountDeposited) {
        balance += amountDeposited;
    }

    public void withdraw(double amountWithdrawn) {
        if(amountWithdrawn <= balance) {
            balance -= amountWithdrawn;
        } else {
            System.out.println("Insufficient balance to withdraw " + amountWithdrawn);
        }
    }

    public void transferMoney(Account from, Account to, double amount) {

        if (amount <= from.balance){
            from.withdraw(amount);
            to.deposit(amount);
            System.out.println("Transferred " + amount + " from " + from.name + " to " + to.name);
        }

    }

    public void displayCurrentBalance() {

        System.out.println("Hey " + name + " Your balance is: " + balance);

    }




}
