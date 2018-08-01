package steps;

import com.nhe.bankapp.domain.Account;
import com.nhe.bankapp.domain.Client;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class WithdrawSteps {

    private static double deltaAmount = 0.0;
    private Account account;

    @Before
    public void init(){
        this.account = new Account(0.0);
    }

    @Given("^an existing client named \"([^\"]*)\" with (\\d+.\\d+) EUR in his account$")
    public void an_existing_client_named_with_EUR_in_his_account(String clientName, double amount) {
        Client client =  new Client(clientName);
        this.account.deposit(amount);

        assertTrue(client.getFirstName().equals("pierre-Jean"));
        assertEquals(this.account.getBalance(),amount,deltaAmount );
    }

    @When("^he withdraws (\\d+.\\d+) EUR from his account$")
    public void he_withdraws_EUR_from_his_account(double withdrawAmount) {
        this.account.withdraw(withdrawAmount);
    }

    @Then("^the new balance is (\\d+.\\d+) EUR$")
    public void the_new_balance_is_EUR(double balance) {
        assertEquals(this.account.getBalance(), balance,deltaAmount);
    }

}
