package Abstraction;

public class TestPage {
    public static void main(String[] args) {
        loginPage l1 = new loginPage();
        l1.header();
        l1.title();
        l1.logout();
        l1.login("Tester","123456");
    }
}
