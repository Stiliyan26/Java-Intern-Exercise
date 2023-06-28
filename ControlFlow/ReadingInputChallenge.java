package ControlFlow;

import java.util.Scanner;

public class ReadingInputChallenge {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int counter = 1;
        double sum = 0;

        do {
            System.out.println("Enter number #" + counter + ":");
            String nextNumber = scanner.next();
            try {
                //int number = Integer.parseInt(nextNumber);
                double number = Double.parseDouble(nextNumber);
                counter++;
                sum += number;
            } catch (NumberFormatException nfe){
                System.out.println("Invalid number");
            }
        } while (counter <= 5);

        System.out.println("The sun of the 5 numbers = " + sum);
    }
}
