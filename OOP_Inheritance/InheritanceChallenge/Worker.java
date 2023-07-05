package OOP_Inheritance.InheritanceChallenge;
import java.time.LocalDate;
import java.time.Period;
public class Worker {
    public String getName() {
        return name;
    }

    private String name;
    private String birthday;
    private String endDate;

    public Worker(String name, String birthday, String endDate) {
        this.name = name;
        this.birthday = birthday;
        this.endDate = endDate;
    }

    public int getAge(){
        LocalDate dateOfBirth = LocalDate.parse(birthday);
        LocalDate currentDate = LocalDate.now();
        Period age = Period.between(dateOfBirth, currentDate);
        int years = age.getYears();

        return years;
    }

    public double collectPay(){
        return 2000;
    }

    public void terminate(String endDate) {
        LocalDate endDateLocalDate = LocalDate.parse(endDate);
        LocalDate currentDate = LocalDate.now();

        if (endDateLocalDate.equals(currentDate)) {
            System.out.println(getName() + " does now work here anymore!");
        }
    }

    @Override
    public String toString() {
        return "Worker{" +
                "name='" + name + '\'' +
                ", birthday='" + birthday + '\'' +
                ", endDate='" + endDate + '\'' +
                '}';
    }
}
