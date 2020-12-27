package Accounts;

public class CreditAccount extends Account {

    public CreditAccount() {
        super(0, "CreditAccount");
    }

    @Override
    public boolean addMoney(int amount)  {
        if (amount + this.amount > 0) {
            System.out.println("The Credit Account can't be positive");
            return false;
        } else {
            return super.addMoney(amount);
        }
    }

    @Override
    public String toString() {
        return "The amount of CreditAccount is " + amount;
    }
}
