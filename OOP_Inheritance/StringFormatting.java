package OOP_Inheritance;

public class StringFormatting {
    public static void main(String[] args) {
        int age = 10;
        String formattedString = String.format("I am %d years old.", age);

        double price = 20.2;
        String getFormattedString = "This apple costs %.2f levas."
                .formatted(price);

        System.out.println(formattedString);
        System.out.println(getFormattedString);
    }
}
