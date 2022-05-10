package SuperKeyword.Variable;

public class JuniorTester {
    int salary = 2000;
}
    class SeniorTester extends JuniorTester {
        int salary = 4000;

        void displaySalaries() {
            System.out.println("Junior Tester Salary:" + super.salary);
            System.out.println("Senior Tester Salary:" + salary);
        }

        public static void main(String[] args) {
            SeniorTester obj = new SeniorTester();
            obj.displaySalaries();
        }


}
