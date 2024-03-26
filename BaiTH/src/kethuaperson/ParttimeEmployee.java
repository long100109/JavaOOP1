package kethuaperson;
import java.util.Scanner;
public class ParttimeEmployee extends employees{
    public int hours;
    public double hourlyrate;
    public ParttimeEmployee(String Fullname, String gender, int age, String job, int hours, double hourlyrate) {
        super(Fullname, gender, age, job);
        this.hours=hours;
        this.hourlyrate=hourlyrate;
    }
    public double calculatesalary() {
        return hours*hourlyrate;
    }    
}

