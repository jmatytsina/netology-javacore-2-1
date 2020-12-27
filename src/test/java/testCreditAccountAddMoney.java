import Accounts.*;
import org.hamcrest.Matcher;
import org.hamcrest.Matchers;
import org.junit.jupiter.api.Test;
import static org.hamcrest.MatcherAssert.assertThat;

public class testCreditAccountAddMoney {
    CreditAccount account = new CreditAccount();

    @Test
    public void writeOffAccount() {
        Matcher matchers = Matchers.is(account.addMoney(1));
        Matcher matcher = Matchers.is(account.addMoney(-1));
        assertThat(false, matchers);
        assertThat(true, matcher);
    }
}
