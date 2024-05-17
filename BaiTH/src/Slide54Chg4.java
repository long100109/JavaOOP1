import java.util.HashSet;
import java.util.Scanner;

public class Slide54Chg4 {
    public static void main(String[] args) {
        int num;
        HashSet<Integer> hashSetInt = new HashSet<>();
        Scanner sc = new Scanner(System.in);
        hashSetInt.add(0);
        hashSetInt.add(6);
        hashSetInt.add(3);
        hashSetInt.add(4);
        System.out.println("Cac phan tu trong hashSetInt:"+hashSetInt);
        System.out.println("Nhap phan tu can them:");
        num=sc.nextInt();
        if(!hashSetInt.contains(num)) {
            hashSetInt.add(num);
            System.out.println("Them thanh cong");
            System.out.println("Cac phan tu trong hashSetInt sau khi them:"+hashSetInt);
        } else {
            System.out.println("Phan tu "+num+" da ton tai");
        }
    }
}
