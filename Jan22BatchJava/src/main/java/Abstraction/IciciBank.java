package Abstraction;
/*
- We cannot have a method body  - Only method declaration - 100% abstraction
- It will define all methods in interface with no implementation
- Use tio define rules.(different methods)
- No static methods in interface because we cannot override static. (Overridden is compulsory)
- We can't create object of interface.
- Interface are simple than classes - just declare method and override in class
- Class to Class  : extends
- Interface to class : implements
- Interface to Interface : extends


 */
public class IciciBank implements UkBank,UsaBank,AusBank {


    @Override
    public void debitCard() {
        System.out.println("Icici Bank ----- Debit Card");

    }

    @Override
    public void savingAccount() {
        System.out.println("Icici Bank ----- Saving Account");
    }

    @Override
    public void freeCashWithdrawals() {
        System.out.println("Icici Bank ----- Free cash Withdrawals");
    }

    @Override
    public void chequeBook() {
        System.out.println("Icici Bank ----- Cheque Book");
    }


}
