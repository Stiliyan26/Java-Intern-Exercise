package OOP_Inheritance.InheritanceChallenge;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        SalariedEmployee emp = new SalariedEmployee("Bogdan",
                "2003-05-16", "2024-08-05",
                2, "2022/12/04", 3000.25, false);

        System.out.println(emp.getName() + " " + emp.getAge() + " years old!");

        System.out.println(emp.getName() + " emplpyee has salary: " +
                emp.collectPay() + "leva");

        LocalDate currentDate = LocalDate.now();
        emp.terminate(currentDate.toString());

        emp.retire();

        HourlyEmployee empHourly = new HourlyEmployee("Kiril",
                "2003-05-16", "2024-08-05",
                "2022/12/04", 20);

        empHourly.getDoublePay(5);
        System.out.println(emp);
        System.out.println(empHourly);

    }
}
