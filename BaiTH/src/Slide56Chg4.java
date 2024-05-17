import java.util.HashSet;
import java.util.Scanner;

public class Slide56Chg4 {
    public static void main(String[] args) {
        String name;
        HashSet<String> hashSetString = new HashSet<>();
        Scanner sc = new Scanner(System.in);
        hashSetString.add("Ngan");
        hashSetString.add("Hoa");
        hashSetString.add("Tien");
        hashSetString.add("Dinh");
        System.out.println("Cac phan tu trong hashSetString:"+hashSetString);
        System.out.println("Nhap phan tu can xoa:");
        name=sc.nextLine();
        if(hashSetString.contains(name)) {
            hashSetString.remove(name);
            System.out.println("Xoa thanh cong");
            System.out.println("Cac phan tu hashSetString sau khi xoa:"+hashSetString);            
        } else {
            System.out.println("Xoa khong thanh cong");
        }
    }
}
