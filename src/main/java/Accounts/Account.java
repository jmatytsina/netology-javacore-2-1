package Accounts;

public abstract class Account {
    protected int amount;

    public Account (int amount, String accountName) {
        this.amount = amount;
    }

    public boolean pay (int amount) throws RuntimeException {
        return this.writeoff(amount);
    }

    protected boolean writeoff (int amount) throws RuntimeException  {
        if (amount > 0) {
            this.amount -= amount;
            return true;
        } else {
            throw new RuntimeException ("Writing off negative number");
        }
    }

    public int getAmount() {
        return amount;
    }

    public boolean addMoney (int amount) {
        this.amount += amount;
        return true;
    }

    public boolean transfer (Account account, int amount) throws RuntimeException {
            this.writeoff(amount);
            if (account.addMoney(amount)) {
                return true;
            } else {
                this.addMoney(amount);
                return false;
            }
    }

    @Override
    public String toString() {
        return "The amount is " + amount;
    }
}
