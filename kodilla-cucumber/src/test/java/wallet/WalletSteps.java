package wallet;

import io.cucumber.java8.En;
import org.junit.Assert;


public class WalletSteps implements En {
    private final Wallet wallet = new Wallet();
    private final CashSlot cashSlot = new CashSlot();

    private int request;
    private int dispensed;

    public void WalletSteps() {
        Given("I have deposited $200 in my wallet", () -> {
            wallet.deposit(200);
        });

        When("I request ${int}", (Integer integer) -> {
            Cashier cashier = new Cashier(cashSlot);
            cashier.withdraw(wallet, integer);
        });

        Then("{int} should be dispensed", (Integer integer2) -> {
            Cashier cashier = new Cashier(cashSlot);
            cashier.withdraw(wallet,integer2);
        });
    }
}
