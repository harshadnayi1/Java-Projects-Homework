package Encapsulation;

public class EmployeeTest {

    //6 create object of the EmplyeeData class
    public static void main(String[] args) {

        EmplyeeData e1 = new EmplyeeData();
        e1.name = "Tester";
        e1.id = 100;
        System.out.println(e1.name);
        System.out.println(e1.id);

//        e1.getEmpName();

//        e1.getSalary();

        e1.setSalary(45000);
        System.out.println(e1.getSalary());
    }
}
