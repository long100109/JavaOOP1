package kethuaperson;
import java.util.Scanner;
public class FulltimeEmployee extends employees{
    public int days;
    public double dailyrate;
    public FulltimeEmployee(String Fullname, String gender, int age, String job, int days, double dailyrate) {
        super(Fullname, gender, age, job);
        this.days=days;
        this.dailyrate=dailyrate;
    }
    public double calculatesalary() {
        return days*dailyrate;
    }    
}
