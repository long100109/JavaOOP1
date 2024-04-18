package Hinhhoc;

import java.util.Scanner;

public class Hinhchunhat extends Hinhhoc{
    public Hinhchunhat() {
        super();
    }
    public float dai,rong;
    public void nhapCanh() {
        Scanner sc = new Scanner(System.in);
        System.out.println(" Nhap chieu dai : ");
        dai=sc.nextFloat();    
        System.out.println(" Nhap chieu rong : ");
        rong=sc.nextFloat();   
    }
    public void tinhChuVi() {
        chuVi=(dai+rong)*2;
    }
    public void tinhDienTich() {
        dienTich=dai*rong;
    }
}