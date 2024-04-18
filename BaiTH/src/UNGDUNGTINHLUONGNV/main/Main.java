package main;
import model.NhanVienFullTime;
import model.NhanVienPartTime;
import util.Configs;
public class Main {
    public static void main(String[] args) {
        NhanVienFullTime sep= new NhanVienFullTime("Tran Van Do");
        sep.setLoaiChucVu(1);
        NhanVienFullTime linh1 = new NhanVienFullTime("Dao Trong Nghia");
        linh1.setLoaiChucVu(2);
        NhanVienFullTime linh2 = new NhanVienFullTime("Ha Van The",3);
        linh2.setLoaiChucVu(2);
        NhanVienPartTime thoiVu = new NhanVienPartTime("Phan Thi Ngoc", 240);
        sep.tinhLuong();
        linh1.tinhLuong();
        linh2.tinhLuong();
        thoiVu.tinhLuong();
        sep.xuatThongTin();
        linh1.xuatThongTin();
        linh2.xuatThongTin();
        thoiVu.xuatThongTin();
    }
}
