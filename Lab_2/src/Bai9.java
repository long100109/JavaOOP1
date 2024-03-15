import java.util.Scanner;
public class Bai9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap chuoi ky tu : ");
        String chuoi = sc.nextLine();
        int kytuthuong = 0, kytuhoa = 0, so = 0;
        for(int i=0; i < chuoi.length(); i++) {
            if(chuoi.charAt(i) >= 97 && chuoi.charAt(i) <= 122 ) {
                kytuthuong++;
            } else if (chuoi.charAt(i) >= 65 && chuoi.charAt(i) <= 90) {
                kytuhoa++;
            } else if (chuoi.charAt(i) >= 48 && chuoi.charAt(i) <= 57) {
                so++;
            } else if (chuoi.charAt(i)>122) {
             System.out.println("Chuoi co ki tu khong xac dinh");
            }
        }
        System.out.println("So ki tu thuong trong chuoi la : " + kytuthuong);
        System.out.println("So ki tu hoa trong chuoi la : " + kytuhoa);
        System.out.println("So ki tu chu so trong chuoi la : " + so);
        sc.close();
    } 
}