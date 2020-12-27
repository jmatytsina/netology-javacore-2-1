package Accounts;

public class CheckingAccount extends Account {

    public CheckingAccount (int amount) {
        super(amount, "CheckingAccount");
    }

    @Override
    public boolean pay(int amount) {
        if (this.amount < amount) {
            System.out.println("You can't pay more money than you have");
            return false;
        } else {
            return super.pay(amount);
        }
    }

    @Override
    public boolean transfer(Account account, int amount) {
        if (this.amount < amount) {
            System.out.println("You can't transfer more money than you have");
            return false;
        } else {
            return super.transfer(account, amount);
        }
    }

    @Override
    public String toString() {
        return "The amount of CheckingAccount is " + amount;
    }
}
