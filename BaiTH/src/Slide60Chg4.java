import java.util.LinkedHashSet;
import java.util.Scanner;

public class Slide60Chg4 {
    public static void main(String[] args) {
        String name;
        Scanner sc = new Scanner(System.in);
        LinkedHashSet<String> linkedHashSetStr = new LinkedHashSet<>();
        linkedHashSetStr.add("Java");
        linkedHashSetStr.add("C++");
        linkedHashSetStr.add("PHP");
        for (String str : linkedHashSetStr) {
            System.out.println(str);
        }
        System.out.println("Ten mon can xoa:");
        name= sc.nextLine();
        if (linkedHashSetStr.contains(name)) {
            linkedHashSetStr.remove(name);
            System.out.println("Xoa thanh cong");
            System.out.println("Cac phan tu con lai sau khi xoa:"+linkedHashSetStr);
        } else {
            System.out.println("Xoa khong thanh cong");
        }
    }
}
