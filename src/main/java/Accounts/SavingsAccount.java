package Accounts;

public class SavingsAccount extends Account {

    public SavingsAccount (int amount) {
        super(amount, "SavingsAccount");
    }

    @Override
    public boolean pay(int amount) {
        System.out.println("The payment from Saving Account is impossible!");
        return false;
    }

    @Override
    public boolean transfer(Account account, int amount) {
        if (amount <= this.amount) {
            return super.transfer(account, amount);
        } else {
            System.out.println("The transferring amount is more than left sum on Saving Account!");
            return false;
        }
    }

    @Override
    public String toString() {
        return "The amount of SavingAccount is " + amount;
    }
}
