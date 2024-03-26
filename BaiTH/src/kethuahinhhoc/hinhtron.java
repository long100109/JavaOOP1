package kethuahinhhoc;
import java.util.Scanner;
public  class hinhtron extends hinhhoc {
    public float banKinh;
    public hinhtron() {
        ten=" Hinh Tron ";
    }
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
