package arr;

import java.util.Arrays;
import java.util.Scanner;

public class MinimumElementChallenge {
    public static void main(String[] args) {

        int[] numbers = readIntegers();
        System.out.println(Arrays.toString(numbers));


        int minValue = findMinValue(numbers);
        System.out.println("Min number: " + minValue);
    }

    private static int findMinValue(int[] numbers){
        int minValue = Integer.MAX_VALUE;

        for (int el : numbers){
            if (el < minValue){
                minValue = el;
            }
        }

        return minValue;
    }
    private static int[] readIntegers(){
        System.out.print("Enter numbers: ");
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        String[] numberStrings = input.split(",");

        int[] numbers = new int[numberStrings.length];

        for (int i = 0; i < numberStrings.length; i++) {
            numbers[i] = Integer.parseInt(numberStrings[i]);
        }

        return numbers;
    }
}
