import java.util.Scanner;
public class Bai3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print(" Nhap ten cua ban : ");
        String ten = sc.nextLine();
        System.out.print(" Nhap nam sinh cua ban : ");
        int namsinh = sc.nextInt();
        int tuoi = 2024 - namsinh;
        if(tuoi<16) {
        System.out.print(" Ban " + ten + " o do tuoi vi thanh nien ");
        }
        else if (tuoi>=16 && tuoi<18) {
        System.out.print(" Ban " + ten + " o do tuoi truong thanh ");    
        }
        else System.out.print(" Ban " + ten + " da gia ");
        sc.close();
    }
}