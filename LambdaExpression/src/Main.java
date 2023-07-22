import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Main {
    record Person(String name, int age) {
        @Override
        public String toString() {
            return "Person{" +
                    "name='" + name + '\'' +
                    ", age=" + age +
                    '}';
        }
    }

    public static void main(String[] args) {
        List<Person> people = new ArrayList<>(Arrays.asList(
                new Main.Person("Kiro", 12),
                new Person("Stiliyan", 14),
                new Person("Bogdan", 19),
                new Person("Bogdan", 18)
        ));

        var comperatorFirstName = new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return o1.name().compareTo(o2.name());
            }
        };

        people.sort((o1, o2) -> o1.name().compareTo(o2.name()));
        System.out.println(people);

        interface EnhancedComparator<T> extends Comparator<T> {
            int secondLevel(T o1, T o2);
        }

        var comperatorMixed = new EnhancedComparator<Person>() {

            @Override
            public int compare(Person o1, Person o2) {
                int result = o1.name().compareTo(o2.name());
                return (result == 0 ? secondLevel(o1, o2) : result);
            }

            @Override
            public int secondLevel(Person o1, Person o2) {
                return o1.age() < o2.age() ? -1 : 1;
            }
        };

        people.sort(comperatorMixed);
        System.out.println(people);
    }
}
