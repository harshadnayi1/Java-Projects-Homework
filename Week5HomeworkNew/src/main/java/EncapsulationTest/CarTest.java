package EncapsulationTest;

public class CarTest {
    public static void main(String[] args) {
        Car carObj = new Car();

        carObj.setModel("Ferrari");
        System.out.println(carObj.getModel());

        carObj.setWheel(4);
        System.out.println(carObj.getWheel());

        carObj.setOwner("Sanjaybhai");
        System.out.println(carObj.getOwner());

        carObj.setRegDate("01/04/2022");
        System.out.println(carObj.getRegDate());

        }

}
