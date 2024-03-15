import java.util.Scanner;
public class Bai8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, number ;
        double sum = 0;
        System.out.print("nhap vao bao nhieu so nguyen: ");
            n = sc.nextInt();
            for(int i =1; i <=n; i++) {
                System.out.print("Nhap so thu "  + i + ": ");
                number = sc.nextInt();
                sum += number;
            }
                double TBC = sum / n ;
            System.out.println("Trung binh cong cua " + n + " so nguyen la:" + TBC);
        sc.close();
    }
}
