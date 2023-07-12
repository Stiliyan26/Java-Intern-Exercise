package Collections;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class ArraysListsTask {
    public static void main(String[] args) {
        ArrayList<String> arrList = new ArrayList<>();

        printMenuOptions();

        int input = validInput();

        while (input != 3) {
            switch (input) {
                case 1 -> addItemToArrayList(arrList);
                case 2 -> removeItemFromList(arrList);
            }
            printMenuOptions();

            input = validInput();
        }
    }
    public static void printMenuOptions(){
        System.out.println("Available actions: ");

        System.out.println("1 to add item(s) to list (comma delimited list)");
        System.out.println("2 to remove any items (comma delimited list)");
        System.out.println("3 to exit)");

        System.out.print("Enter a number for which action you want to do: ");
    }
    public static Scanner getScanner(){
         return new Scanner(System.in);
    }
    public static void removeItemFromList(ArrayList<String> arrList){
        Scanner scanner = getScanner();
        System.out.print("Enter item to be removed: ");
        String item = scanner.nextLine();

        if (arrList.contains(item)){
            arrList.remove(item);
        }

        ArrayList<String> sortedArrList = new ArrayList<>(arrList);
        sortedArrList.sort(Comparator.naturalOrder());

        System.out.println("Sorted list: " + sortedArrList);
    }
    public static void addItemToArrayList(ArrayList<String> arrList){
        Scanner scanner = getScanner();
        System.out.print("Enter an item to be addded: ");
        String item = scanner.nextLine();

        if (!arrList.contains(item)){
            arrList.add(item);
        } else {
            System.out.println("Already contains this item!");
        }

        ArrayList<String> soretedArrList =
                new ArrayList<>(arrList);
        soretedArrList.sort(Comparator.naturalOrder());

        System.out.println("Sorted list: " + soretedArrList);
    }
    public static int validInput(){
        Scanner scanner = getScanner();
        int input = scanner.nextInt();

        while (input != 1 && input != 2 && input != 3) {
            System.out.println("Invalid number try again!");
            input = scanner.nextInt();
        }

        return input;
    }
}
