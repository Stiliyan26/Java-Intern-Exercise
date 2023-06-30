package OOP_Inheritance;

public class MainCustomer {
    public static void main(String[] args) {
        Customer customer = new Customer("Stiliyan", 20, "stili@abv.bg");
        System.out.println(customer.getName());
        System.out.println(customer.getCreditLimit());
        System.out.println(customer.getEmail());

        Customer secondCustomer = new Customer();
        System.out.println(secondCustomer.getName());
        System.out.println(secondCustomer.getCreditLimit());
        System.out.println(secondCustomer.getEmail());

        Customer thirdCustomer = new Customer("Joe", "joe@abv.bg");
        System.out.println(thirdCustomer.getName());
        System.out.println(thirdCustomer.getCreditLimit());
        System.out.println(thirdCustomer.getEmail());
    }
}
