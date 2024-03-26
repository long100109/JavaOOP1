package kethuaperson;
import java.util.Scanner;
public class person {
    public String Fullname, gender;
    public int age;
    public person(String Fullname, String gender, int age) {
        this.Fullname=Fullname;
        this.gender=gender;
        this.age=age;
    }
    public void input() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap ho va ten:");
        Fullname=sc.nextLine();
        System.out.println("Nhap gioi tinh:");
        gender=sc.nextLine();
        System.out.println("Nhap tuoi:");
        age=sc.nextInt();
    }
    public void output() {
        System.out.println("Ho va ten:"+Fullname);
        System.out.println("Gioi tinh:"+gender);
        System.out.println("Tuoi:"+age);
    }    
}