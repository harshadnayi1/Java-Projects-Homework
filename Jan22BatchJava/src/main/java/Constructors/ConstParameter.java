package Constructors;

public class ConstParameter {
    int modelYear;
    String modelName;

    public ConstParameter(int Year, String Name ){
        modelYear = Year;
        modelName = Name;

    }

    public static void main(String[] args) {
        ConstParameter myCar = new ConstParameter(2022,"BMW");
        System.out.println(myCar.modelYear+ " " + myCar.modelName);
    }
}
