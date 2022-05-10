package SuperKeyword.Constructor;

public class JuniorTester {
    int salary;

    JuniorTester(int salary) {
       this.salary = salary;
    }
}
    class SeniorTester extends SuperKeyword.Constructor.JuniorTester{
    int salary;
    SeniorTester(int salJunior, int salSenior){
        super(salJunior);
        salary =salSenior;
    }
    void display(){
        System.out.println("Senior Tester:"+ salary+ " "+"Junior Tester:"+super.salary);
    }

        public static void main(String[] args) {
            SeniorTester obj =new SeniorTester(5000,10000);
            obj.display();
        }

}
