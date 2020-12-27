import Accounts.CheckingAccount;
import Accounts.CreditAccount;
import Accounts.SavingsAccount;

public class Main {
    public static void main(String[] args) {
        SavingsAccount savAcc = new SavingsAccount(10_000);
        CreditAccount credAcc = new CreditAccount();
        CheckingAccount checkAcc = new CheckingAccount(20_000);
        savAcc.addMoney(1_000);
        savAcc.pay(500);
        System.out.println(savAcc.toString());
        credAcc.addMoney(500);
        credAcc.transfer(savAcc, 1_000);
        System.out.println(savAcc.toString());
        System.out.println(credAcc.toString());
        checkAcc.addMoney(5_000);
        System.out.println(checkAcc.toString());
        savAcc.transfer(credAcc, 1500);
        System.out.println(savAcc);
        System.out.println(credAcc);
    }
}
