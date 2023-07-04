package OOP_Inheritance.Inheritance;

public class Main {
    public static void main(String[] args) {
        Animal animal = new Animal("Tiger", "Hige", 400);
        doAnimalStuff(animal, "slow");

        Dog dog = new Dog();
        doAnimalStuff(dog, "fast");
    }

    public static void doAnimalStuff(Animal animal, String speed){
        animal.makeNoice();
        animal.move(speed);

        System.out.println(animal);
        System.out.println("_____");
    }
}
