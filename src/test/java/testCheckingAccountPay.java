import Accounts.CheckingAccount;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class testCheckingAccountPay {
    private static CheckingAccount account;

    @BeforeAll
    static void initialize() {
        account = new CheckingAccount(200);
    }

    @Test
    void positiveTest() {

        // when:
        boolean result = account.pay(100);

        // then:
        Assertions.assertTrue(result);
    }

    @Test
    void negativeTest() {
        // when:
        boolean result = account.pay(1000);

        // then:
        Assertions.assertFalse(result);
    }

    @Test
    void testWrongArgument() {

        // expect:
        Assertions.assertThrows(RuntimeException.class, () -> {account.pay(-20);});
    }
}
