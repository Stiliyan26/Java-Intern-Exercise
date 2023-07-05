package OOP_Inheritance.Inheritance;

public class Main {
    public static void main(String[] args) {
        Animal animal = new Animal("Tiger", "Hige", 400);
        doAnimalStuff(animal, "slow");

        Dog dog = new Dog();
        doAnimalStuff(dog, "fast");

        Dog yorkie = new Dog("Yorkei", 15);
        doAnimalStuff(yorkie, "fast");
        Dog retriever = new Dog("Labrador Retriver", 65,
                "Floppy", "Swimmer");
        doAnimalStuff(retriever, "slow");

        Dog wolf = new Dog("Wolf", 40);
        doAnimalStuff(wolf, "slow");

        Fish newFish = new Fish("Goldfish", 0.25, 2, 3);
        doAnimalStuff(newFish, "fast");
    }

    public static void doAnimalStuff(Animal animal, String speed){
        animal.makeNoice();
        animal.move(speed);

        System.out.println(animal);
        System.out.println("_____");
    }
}
