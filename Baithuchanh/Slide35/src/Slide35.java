import java.util.Scanner;
public class Slide35 {
public static void main(String[] args) {
    int a, b;
    Scanner sc = new Scanner(System.in);
    System.out.print("Nhap so thu nhat : ");
    a = sc.nextInt();
    System.out.print("Nhap so thu hai : ");
    b = sc.nextInt();
    sc.close();
    int min = a;
    if (a > b) min = b;
    System.out.println("So nho nhat trong 2 so " + a + " va " + b + " la " + min);
    }
}