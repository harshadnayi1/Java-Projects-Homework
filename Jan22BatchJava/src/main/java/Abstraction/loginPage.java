package Abstraction;

public class loginPage extends Pages {

    @Override
    public void header() {
        System.out.println("Login page Header");
    }

    @Override
    public void title() {
        System.out.println("Login page Title");
    }

    public void login(String Uname, String Password){
        System.out.println("Login Page  - Login");
        System.out.println("Login with "+ Uname + "and " +Password );
    }

}
