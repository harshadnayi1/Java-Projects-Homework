package EncapsulationTest;

public class Car {

    public String model;
    public int wheel;
    private String owner;
    private String regDate;

    public String getModel(){
        return model;
    }
    public void setModel(String model){
        this.model = model;
    }
    public int getWheel() {
        return wheel;
    }
    public String getRegDate(){
        return regDate;
    }
    public void setRegDate(String regDate){
        this.regDate = regDate;
    }


    public void setWheel(int wheel){
        this.wheel = wheel;
        }
      public String getOwner(){
        return owner;
        }

        public void setOwner(String owner){
        this.owner = owner;
        }

}

