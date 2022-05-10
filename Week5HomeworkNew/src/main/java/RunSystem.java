public class RunSystem {

        static int timesMethod(int a, int b) {
            return a*b;
        }
        static double timesMethod(double a, double b) {
            return a*b;
        }
        public static void main(String[] args) {
            int intNum = timesMethod(7, 6);
            double doubleNum = timesMethod(7.6, 6.7);
            System.out.println("Integer Times: " + intNum);
            System.out.println("double Times: " + doubleNum);


        System.out.println("\nCurrent Account: ");
        CurrentAccount c = new CurrentAccount();
        c.withdrawCash();
        c.depositCash();
        c.payBills();
        c.BankGurantee();

        System.out.println("\nSaving Account: ");
        SavingAccount s = new SavingAccount();
        s.withdrawCash();
        s.depositCash();
        s.BankGurantee();

        System.out.println("\nISA Account: ");
        ISAAccount i = new ISAAccount();
        i.withdrawCash();
        i.depositCash();
        i.BankGurantee();

    }
}
