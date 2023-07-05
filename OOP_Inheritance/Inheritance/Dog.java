package OOP_Inheritance.Inheritance;

public class Dog extends Animal {
    private String earShape;
    private String tailshape;

    public Dog(String type, double weight){
        this(type, weight, "Perky", "Curled");
    }
    public Dog() {
        super("Matt", "Big", 50);
    }
    public Dog(String type, double weight, String earShape, String tailShape) {
        super(type, weight < 15 ? "Small" : (weight < 35 ? "medium" : "large"),
                weight);
        this.earShape = earShape;
        this.tailshape = tailShape;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "earShape='" + earShape + '\'' +
                ", tailshape='" + tailshape + '\'' +
                "} " + super.toString();
    }
    @Override
    public void move(String speed) {
        super.move(speed);
        if (speed == "slow"){
            walk();
        } else {
            run();
            bark();
        }

        System.out.println();
    }

    public void makeNoice(){
        if (type == "Wolf"){
            System.out.println("Ow Woooo!");
        }
        bark();
        System.out.println();
    }
    private void bark(){
        System.out.println("Woof! ");
    }

    private void run(){
        System.out.println("Dog running ");
    }

    private void walk(){
        System.out.println("Dog walking ");
    }

    private void wagTail() {
        System.out.println("Tail wagging ");
    }
}
