package kethuahinhhoc;
import java.util.Scanner;
public class hinhvuong extends hinhchunhat {
    public hinhvuong() {
        ten=" Hinh Vuong ";
    }
    public void nhapCanh() {
        Scanner sc = new Scanner(System.in);
        System.out.println(" Nhap canh : ");
        dai=rong=sc.nextFloat();
    }
}
