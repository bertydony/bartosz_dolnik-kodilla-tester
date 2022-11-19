package wallet;

public class Cashier {

    private final CashSlot cashSlot;

    public Cashier(CashSlot cashSlot) {
        this.cashSlot = cashSlot;
    }

    public void withdraw(Wallet wallet, int amount) {
        cashSlot.dispense(amount);
    }
}
