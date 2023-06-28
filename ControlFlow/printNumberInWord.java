package ControlFlow;
public class printNumberInWord {
    public static void main(String[] args) {
        int number = 5;

        switch (number){
            case 0 -> System.out.println("ZERO");
            case 1 -> System.out.println("ONE");
            case 2 -> System.out.println("TWO");
            case 3 -> System.out.println("THREE");
            case 4 -> System.out.println("FOUR");
            default -> System.out.println("DEFAULT");
        }
    }
}
