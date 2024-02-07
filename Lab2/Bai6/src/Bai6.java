import java.util.Scanner;
public class Bai6 {
    public static void main(String[] args) {
        int number, giaithua=1;
        Scanner sc = new Scanner(System.in);
        do {
        System.out.print("Nhap vao 1 so nguyen duong :");
        number = sc.nextInt();
        if (number<=0)
            System.out.println("Vui long nhap vao so nguyen duong");
        } while (number<=0); 
            for(int i =1; i<= number ; i++)
            giaithua*=i;
        System.out.println("Giai thua cua so vua nhap la : " +giaithua );
        sc.close();
    }
}