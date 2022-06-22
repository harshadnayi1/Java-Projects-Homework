public class ReverseString {
    public static void main(String[] args) {

        String text = "Mansi is naughty";
        StringBuilder text1 = new StringBuilder();
        text1.append(text);
        text1.reverse();
        System.out.println(text1); // print reverse character

        System.out.println(text.length()); // lemgth of characters
        System.out.println(text.toUpperCase()); //uppercase
        System.out.println(text.toLowerCase()); //lowercase

    }
}
