package OOP_Inheritance.InheritanceChallenge;

public class HourlyEmployee extends Employee {
    private double hourlyPayRate;

    public HourlyEmployee(String name, String birthday, String endDate,
                          String hireDate, double hourlyPayRate) {
        super(name, birthday, endDate, hireDate);
        this.hourlyPayRate = hourlyPayRate;
    }

    public void getDoublePay(int hours){
        System.out.println(hourlyPayRate * hours * 2);
    }


}
