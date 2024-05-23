import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
public class Bai1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<>();
        System.out.println("Nhap vao day so nguyen (nhap -1 de ket thuc):");
        int num;
        while ((num = sc.nextInt()) != -1) {
            numbers.add(num);
        }
        int max = Collections.max(numbers);
        System.out.println("So nguyen lon nhat trong day la: " + max);
        System.out.print("Nhap so nguyen can xoa: ");
        int deleteNum = sc.nextInt();
        numbers.removeIf(n -> n == deleteNum);
        System.out.println("Sau khi xoa phan tu co gia tri " + deleteNum + ": " + numbers);
        Collections.sort(numbers);
        System.out.println("Day so sau khi sap xep:");
        for (int number : numbers) {
            System.out.print(number + " ");
        }
    }
}

