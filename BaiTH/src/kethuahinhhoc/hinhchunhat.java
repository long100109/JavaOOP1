package kethuahinhhoc;
import java.util.Scanner;
public class hinhchunhat extends hinhhoc {
    public float dai, rong;
    public hinhchunhat() {
        ten=" Hinh Chu Nhat ";
    }
    Scanner sc = new Scanner(System.in);
    public void nhapChieuDai() {
          System.out.println(" Chieu Dai : ");
          dai=sc.nextFloat();
    }
    public void nhapChieuRong() {
        System.out.println(" Chieu Rong : ");
        rong=sc.nextFloat();
    }
    public void tinhChuVi() {
        chuVi=2*(dai+rong);
    }
    public void tinhDienTich() {
        dienTich=dai*rong;
    }
}
