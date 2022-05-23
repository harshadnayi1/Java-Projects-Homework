package EncapsulationTest;

public class CompanyTest {
    public static void main(String[] args) {
        Company obj = new Company();
        obj.setName("IBM");
        obj.setTotalEmp(5000);
        obj.setBudget(10000);
        obj.setProjects("AI - ROBOTICS");

//With the help of all set methods I am trying to fillin the values. (setter)
//With the help of get methods I can access them.(getter)

        System.out.println(obj.getName());
        System.out.println(obj.getTotalEmp());
        System.out.println(obj.getProjects());
        System.out.println(obj.getBudget());
    }
}
