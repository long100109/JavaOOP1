package Hinhhoc;

import java.util.Scanner;

public class Hinhtron extends Hinhhoc {
    public Hinhtron() {
        super();
    }
        public float banKinh;
    public void nhapBanKinh() {
        Scanner sc = new Scanner(System.in);
        System.out.println(" Nhap ban kinh : ");
        banKinh=sc.nextFloat();        
    }
    public void tinhChuVi() {
        chuVi=2*PI*banKinh;
    }
    public void tinhDienTich() {
        dienTich=PI*banKinh*banKinh;
    }    
}
