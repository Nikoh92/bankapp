package junit;

import com.nhe.bankapp.domain.Account;
import com.nhe.bankapp.domain.Client;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AccountTest {

    private Account account;
    private static double deltaAmount = 0.0;
    private static final String accountId = "A345FZ1";

    @Before
    public void init(){

        this.account = new Account(accountId,300.0,new Client("Jean-Pierre"));
    }

    @Test
    public void deposit_an_amount_in_a_bank_account(){
        this.account.deposit(100.0);

        assertEquals(this.account.getBalance(),400.0,deltaAmount );
    }

    @Test
    public void withdraw_an_amount(){
        this.account.withdraw(450.0);

        assertEquals(this.account.getBalance(),-150.0,deltaAmount);

    }


}
