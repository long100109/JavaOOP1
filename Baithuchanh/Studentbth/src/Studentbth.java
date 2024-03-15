import java.util.Scanner;
public class Studentbth {
    public String name;
    public double dtoan, dvan, danh,dtk;  
    Scanner sc = new Scanner(System.in);
    public  void Inputinfo() {      
        System.out.print("Ten sinh vien: ");
        name = sc.nextLine();
        System.out.print("Diem toan: ");
        dtoan=sc.nextDouble();
        System.out.print("Diem van: ");
        dvan=sc.nextDouble();
        System.out.print("Diem anh: ");
        danh=sc.nextDouble();  
        dtk=(dtoan + dvan + danh)/3.0;      
    }    
    public void Displayinfo() {
        System.out.println("Thong tin sinh vien: ");
        System.out.print("Ten sinh vien: "+name);
        System.out.print(" Diem toan: "+dtoan);
        System.out.print(" Diem van: "+dvan);
        System.out.print(" Diem anh: "+danh);
        System.out.print(" Diem tong ket: "+dtk);
    }
}