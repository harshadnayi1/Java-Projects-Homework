package Abstraction;

public class TestBank {
    public static void main(String[] args) {
        IciciBank ic1 = new IciciBank();
        ic1.debitCard();
        ic1.chequeBook();
        ic1.freeCashWithdrawals();
        ic1.savingAccount();
    }
}
