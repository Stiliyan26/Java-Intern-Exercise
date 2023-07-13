package Collections;

import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListFirst {
    public static void main(String[] args) {
        LinkedList<String> placesToVisit = new LinkedList<>();

        placesToVisit.add("Sydney");
        placesToVisit.add(0, "Canberra");

        System.out.println(placesToVisit);
        addMoreElements(placesToVisit);
        System.out.println(placesToVisit);

//        removeElements(placesToVisit);
//        System.out.println(placesToVisit);

        //gettingElement(placesToVisit);
        printItinerary3(placesToVisit);
        testIterator(placesToVisit);
    }

    private static void addMoreElements(LinkedList<String> list){
        list.addFirst("Darwin");
        list.addLast("Hobart");
        //Queue methods
        list.offer("Medlbourne");
        list.offerFirst("Brisbane");
        list.offerLast("Toowoomba");
        //Stack
        list.push("Alice springs");
    }

    private static void removeElements(LinkedList<String> list){
        list.remove(4);
        list.remove("Brisbane");

        System.out.println(list);
        String s1 = list.remove();// remvoes first element
        System.out.println(s1 + " was removed");

        String s2 = list.removeFirst();// remvoes first element
        System.out.println(s2 + " was removed");

        String s3 = list.removeLast();// remvoes last element
        System.out.println(s3 + " was removed");
        //Queue/Dequeue poll methods
        String p1 = list.poll();// remvoes first element
        System.out.println(p1 + " was removed");

        String p2 = list.pollFirst();// remvoes first element
        System.out.println(p2 + " was removed");

        String p3 = list.pollLast();// remvoes last element
        System.out.println(p3 + " was removed");
        //Stack
        list.push("Sydeny");
        list.push("Brisbane");
        list.push("Canberra");

        String p4 = list.pop(); // removes first elemnt
        System.out.println(p4 + " was removed");
    }

    private static void gettingElement(LinkedList<String> list){
        System.out.println("Retrived Element = " + list.get(4));
        System.out.println("First Element = " + list.getFirst());
        System.out.println("Last Element = " + list.getLast());

        //Queue retrival method
        System.out.println("Element from element() = " + list.element());
        //Stack retrival methods
        System.out.println("Element from peek() = " + list.peek());
        System.out.println("Element from peek() = " + list.peekFirst());
        System.out.println("Element from peek() = " + list.peekLast());
    }

    private static void printItinerary(LinkedList<String> list){
        System.out.println("Trip starts at " + list.getFirst());
        for (int i = 1; i < list.size(); i++){
            System.out.println("--Form: " + list.get(i - 1) + " to " + list.get(i));
        }
        System.out.println("Trip ends at " + list.getLast());
    }

    public static void printItinerary2(LinkedList<String> list){
        System.out.println("Trip starts at " + list.getFirst());
        String previousTown = list.getFirst();

        for (String town : list){
            System.out.println("--> Form: " + previousTown + " to " + town);
            previousTown = town;
        }
        System.out.println("Trip ends at " + list.getLast());
    }

    public static void printItinerary3(LinkedList<String> list){
        System.out.println("Trip starts at " + list.getFirst());
        String previousTown = list.getFirst();
        ListIterator<String> iterator = list.listIterator(1);
        while (iterator.hasNext()){
            var town = iterator.next();
            System.out.println("--> Form " + previousTown + " to " + town);
            previousTown = town;
        }
        System.out.println("Trip ends at " + list.getLast());
    }

    private static void testIterator(LinkedList<String> list){
        var iterator = list.iterator();
        System.out.println(list);
        while (iterator.hasNext()){
            //System.out.println(iterator.next());
            if (iterator.next().equals("Brisbane")){
                iterator.remove();
            }
        }

        System.out.println(list);
    }
}
