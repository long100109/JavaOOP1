import java.util.LinkedList;
import java.util.Scanner;
public class Bai2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedList<Integer> numbers = new LinkedList<>();
        System.out.print("Nhap so nguyen duong n: ");
        int n = sc.nextInt();
        System.out.println("Nhap " + n + " so nguyen duong:");
        for (int i = 0; i < n; i++) {
            int num = sc.nextInt();
            if (num > 0) {
                numbers.add(num);
            } else {
                System.out.println("So nhap vao khong phai la so nguyen duong, vui long nhap lai.");
            }
        }
        int sum = 0;
        int count = 0;
        for (int num : numbers) {
            if (num % 2 == 0) {
                sum += num;
                count++;
            }
        }
        if (count > 0) {
            double average = (double) sum / count;
            System.out.println("Trung binh cong cua cac so chan la: " + average);
        } else {
            System.out.println("Khong co so chan nao đe tinh trung binh cong.");
        }
    }
}

