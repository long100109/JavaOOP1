import java.util.Scanner;
public class Employee {
    public String tnv;
    public double lcb, pc, lcung;
    Scanner sc = new Scanner(System.in);
    public void Inputinfo() {
        System.out.println("Ten nhan vien: ");
        tnv=sc.nextLine();
        System.out.print("Luong co ban: ");
        lcb=sc.nextDouble();
        System.out.print("Phu cap: ");
        pc=sc.nextDouble();
        lcung=lcb+pc;
    }

    public void Displayinfo() {
        System.out.println("Ten nhan vien: "+tnv);
        System.out.print(" Luong co ban: "+lcb);
        System.out.print(" Phu cap: "+pc);
        System.out.print(" Luong cung: "+lcung);
    }
}

