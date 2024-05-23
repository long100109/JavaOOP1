package Bai5Lab4;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
public class MainSinhVien {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            Map<String, SinhVien> sinhVienMap = new HashMap<>();
            System.out.print("Nhap so luong sinh vien: ");
            int n = sc.nextInt();
            for (int i = 0; i < n; i++) {
                System.out.println("Nhap thong tin cho sinh vien thu " + (i + 1) + ":");
                System.out.print("Ma sinh vien: ");
                String maSinhVien = sc.nextLine();
                System.out.print("Ho va ten: ");
                String hoTen = sc.nextLine();
                System.out.print("Lop: ");
                String lop = sc.nextLine();
                SinhVien sinhVien = new SinhVien(maSinhVien, hoTen, lop);
                sinhVienMap.put(maSinhVien, sinhVien);
            }
            System.out.print("Nhap ten lop de hien thi sinh vien: ");
            String lopCanTim = sc.nextLine();
            System.out.println("Sinh vien thuoc lop " + lopCanTim + ":");
            for (SinhVien sinhVien : sinhVienMap.values()) {
                if (sinhVien.lop.equals(lopCanTim)) {
                    System.out.println("Ma sinh viên: " + sinhVien.maSinhVien + ", Ho ten: " + sinhVien.hoTen + ", Lop: " + sinhVien.lop);
                }
            }
            System.out.print("Nhap ma sinh vien de hien thi thong tin: ");
            String maSinhVienCanTim = sc.nextLine();
            if (sinhVienMap.containsKey(maSinhVienCanTim)) {
                SinhVien sinhVien = sinhVienMap.get(maSinhVienCanTim);
                System.out.println("Ho ten: " + sinhVien.hoTen + ", Lop: " + sinhVien.lop);
            } else {
                System.out.println("Khong tim thay sinh vien co ma " + maSinhVienCanTim);
            }
        }
    }
