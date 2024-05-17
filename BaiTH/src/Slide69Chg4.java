import java.util.Scanner;
import java.util.TreeSet;

public class Slide69Chg4 {
    public static void main(String[] args) {
        int num;
        TreeSet<Integer> treeSetInt = new TreeSet<>();
        Scanner sc = new Scanner(System.in);
        treeSetInt.add(0);
        treeSetInt.add(7);
        treeSetInt.add(5);
        treeSetInt.add(3);
        System.out.println("Cac phan tu trong treeSetInt:"+treeSetInt);
        System.out.println("Phan tu can them");
        num= sc.nextInt();
        if (!treeSetInt.contains(num)) {
            treeSetInt.add(num);
            System.out.println("Them thanh cong");
            System.out.println("Cac phan tu trong treeSetInt sau khi them:"+treeSetInt);
        } else {
            System.out.println("Phan tu "+num+" da ton tai");
        }
    }
}
