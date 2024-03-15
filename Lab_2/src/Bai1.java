import java.util.Scanner;
public class Bai1 {
    public static void main(String[] args) {
        double a, b;
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so thu nhat : ");
        a = sc.nextDouble();
        System.out.print("Nhap so thu hai: ");
        b = sc.nextDouble();
        double sum = a + b;
        double difference = a - b;
        double product = a * b;
        double quotient = a / b;
        double remainder = a % b;
        System.out.println("Tong: " + sum);
        System.out.println("Hieu: " + difference);
        System.out.println("Tich: " + product);
        System.out.println("Thuong: " + quotient);
        System.out.println("Chia lay du: " + remainder);
        if (a > b) {
            System.out.println(a + " lon hon " + b);
        }
         else if (a < b) {
            System.out.println(a + " nho hon " + b);
        } 
        else {
            System.out.println(a + " bang " + b);
        }
        sc.close();
    }
}