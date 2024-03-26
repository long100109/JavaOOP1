package kethuaperson;
import java.util.Scanner;
public class employees extends person{
    public String job;
    public employees(String Fullname, String gender, int age, String job ) {
        super(Fullname, gender, age);
        this.job=job;
    }
    public void input() {
        super.input();
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap cong viec:");
        job=sc.nextLine();
    }
    public void output() {
        super.output();
        System.out.println("Cong viec:"+job);
    }    
}
