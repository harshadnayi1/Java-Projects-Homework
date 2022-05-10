package SuperKeyword.Method;

public class JuniorTester {
    int salary = 2000;

    void display() {
        System.out.println("Class for Junior Tester");
    }
}
class SeniorTester extends SuperKeyword.Method.JuniorTester {
    int salary = 4000;
    void display() {
        System.out.println("Class for Senior Tester");
    }
    void Hello(){
        display();
        super.display();
    }

    public static void main(String[] args) {
        SuperKeyword.Method.SeniorTester obj = new SuperKeyword.Method.SeniorTester();
        obj.Hello();
    }


}
