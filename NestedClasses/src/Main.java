import domain.Employee;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Employee e1 = new Employee("Minnie", "Mouse", "01/02/2015");
        Employee e2 = new Employee("Mickie", "Mouse", "05/08/2000");
        Employee e3 = new Employee("Daffy", "Duck", "11/02/2011");
        Employee e4 = new Employee("Daisy", "Duck", "05/03/2013");
        Employee e5 = new Employee("Goofy", "Dog", "23/07/2020");

        List<Employee> elist = new ArrayList<>(Arrays.asList(e1, e2, e3, e4, e5));
    }

    public static printOrderedList(List<Employee> elist, String sortField){
        int currentYear = LocalDate.now().getYear();

        class MyEmployee {
            Employee containedEmployee;
            int yearsWorkerd;
            String fullName;

            public MyEmployee(Employee containedEmployee) {
                this.containedEmployee = containedEmployee;
                yearsWorkerd = currentYear - Integer.parseInt(
                        containedEmployee.hireDate().split("/")[2]);
                fullName = String.join(" ", containedEmployee.first(),
                        containedEmployee.last());
            }

            @Override
            public String toString() {
                return "%s has been an employee for %d years"
                        .formatted(fullName, yearsWorkerd);
            }
        }

        List<MyEmployee> list = new ArrayList<>();
        for (Employee employee : elist){
            list.add(new MyEmployee(employee));
        }

    }
}
