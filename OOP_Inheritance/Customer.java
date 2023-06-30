package OOP_Inheritance;

public class Customer {
    private String name;
    private int creditLimit;
    private String email;

    public Customer(){
        this("Kiril", "kiro@abv.bg");
    }

    public Customer(String name, String email){
        this(name, 1000, email);
    }
    public Customer(String name, int creditLimit, String email) {
        this.name = name;
        this.creditLimit = creditLimit;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public int getCreditLimit() {
        return creditLimit;
    }

    public String getEmail() {
        return email;
    }
}
