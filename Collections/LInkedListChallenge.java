package Collections;

import java.util.LinkedList;
import java.util.Scanner;

record Place(String name, int distance) {
    @Override
    public String toString() {
        return String.format("%s (%d)", name, distance);
    }
}

public class LInkedListChallenge {
    public static void main(String[] args) {
        LinkedList<Place> places = new LinkedList<>();
        Place adeline = new Place("Adeline", 1374);
        addPlace(places, adeline);
        addPlace(places, new Place("Brisbane", 917));
        addPlace(places, new Place("Perth", 3923));
        addPlace(places, new Place("Alice Springs", 2771));
        addPlace(places, new Place("Darwin", 3972));
        addPlace(places, new Place("Melbourne", 877));

        places.addFirst(new Place("Sydeny", 0));
        System.out.println(places);

        var iterator = places.listIterator();
        Scanner scanner = new Scanner(System.in);
        boolean quitLoop = false;
        boolean forward = true;
        printMenu();

        while (!quitLoop) {
            if (!iterator.hasPrevious()){
                System.out.println("Originating : " + iterator.next());
                forward = true;
            }
            if (!iterator.hasNext()){
                System.out.println("Final : " + iterator.previous());
                forward = false;
            }
            System.out.print("Enter value: ");
            String menuItem = scanner.nextLine()
                    .toUpperCase()
                    .substring(0, 1);

            switch (menuItem) {
                case "F":
                    System.out.println("User wants to go forward");
                    if (!forward){
                        forward = true;
                        if (iterator.hasNext()){
                            iterator.next();
                        }
                    }
                    if (iterator.hasNext()){
                        System.out.println(iterator.next());
                    }
                    break;
                case "B":
                    System.out.println("User wants to go backwards");
                    if (forward){
                        forward = false;
                        if (iterator.hasPrevious()){
                            iterator.previous();
                        }
                    }

                    if (iterator.hasPrevious()){
                        System.out.println(iterator.previous());
                    }
                    break;
                case "M":
                    printMenu();
                    break;
                case "L":
                    System.out.println(places);
                    break;
                default:
                    quitLoop = true;
                    break;
            }
        }
    }

    private static void printMenu() {
        String textBox = """
                Available actions (select word or letter)
                (F)orward
                (B)ackward
                (L)ist Places
                (M)enu
                (Q)uit""";

        System.out.println(textBox);
    }

    private static void addPlace(LinkedList<Place> places, Place place) {
        if (places.contains(place)) {
            System.out.println("Found duplicate " + place);
            return;
        }

        for (Place p : places) {
            if (p.name().equalsIgnoreCase(place.name())) {
                System.out.println("Found duplicate " + place);
                return;
            }
        }

        int matchedIndex = 0;
        for (var listPlace : places) {
            if (place.distance() < listPlace.distance()) {
                places.add(matchedIndex, place);
                return;
            }

            matchedIndex++;
        }


        places.add(place);
    }
}

