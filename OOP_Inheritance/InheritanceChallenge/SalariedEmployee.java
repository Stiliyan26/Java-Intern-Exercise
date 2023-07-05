package OOP_Inheritance.InheritanceChallenge;

public class SalariedEmployee extends Employee{
    private double annualSalary;
    private boolean isRetired;

    public SalariedEmployee(String name, String birthday, String endDate, long employeeId, String hireDate, double annualSalary, boolean isRetired) {
        super(name, birthday, endDate, hireDate);
        this.annualSalary = annualSalary;
        this.isRetired = isRetired;
    }

    public void retire(){
        System.out.println(getName() + " is retired!");
    }

    @Override
    public double collectPay() {
        return annualSalary;
    }
}
