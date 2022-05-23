package Encapsulation;

import java.sql.SQLOutput;

public class EmplyeeData {

    //4.
//    public EmplyeeData(String name, int id, int Salary){// this keyword :  when you have to give local variable to class variable.)
//        this.name = name;
//        this.id =id;
//        this.Salary =Salary;
//    }

    //2. Create a variables
    public int id;
    public String name;
    private int Salary;

    //3.Create public method
    public void getEmpName(){
        System.out.println("Get Employee Name");
    }
    private void getEmpBonus(){
        System.out.println("Get Employee Bonus");
    }
    //1.
    public static void main(String[] args) {
//Simple variable access
//    EmplyeeData OBJ = new EmplyeeData();
//    OBJ.id = 100;
//    OBJ.name = "Tester";
//    OBJ.Salary = 5000;
//
//        System.out.println("id "+ OBJ.id);
//        System.out.println("name "+OBJ.name);
//        System.out.println("Salary "+OBJ.Salary);

     //5.
//Constructor Variable access
//        EmplyeeData obj1 = new EmplyeeData("Tester",12345,50000);
//        System.out.println(obj1.name);
//        System.out.println(obj1.id);
//        System.out.println(obj1.Salary);

//method access
//        EmplyeeData obj2 = new EmplyeeData();
//        obj2.getEmpName();
//        obj2.getEmpBonus();
    }

    //7.getter and setter method
    public void setSalary(int Salary){

        this.Salary =Salary;
    }
    public int getSalary(){

        return Salary;
    }


}
