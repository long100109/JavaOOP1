import java.util.Scanner;

public class Student {
    public String FullName;
    public int Age;
    public void NhapThongTin() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap ten hoc sinh:");
        FullName = sc.nextLine();
        System.out.println("Nhap tuoi:");
        Age=sc.nextInt();
    }
    public void HienThiThongTin() {
        System.out.println("Ten hoc sinh: "+FullName);
        System.out.println("Tuoi: "+Age);
    }
    public void ThemMoiThongTin(String name, int newAge) {
        FullName= name;
        Age = newAge;
    }
    public void SuaThongTin(String newName, int newAge) {
        FullName=newName;
        Age=newAge;
    }    
}
