package model;
import util.Configs;
public class NhanVienFullTime extends NhanVien {
    private int ngayLamThem;
    private int loaiChucVu;
    public NhanVienFullTime(String ten) {
        this.ten = ten;
    }
    public NhanVienFullTime(String ten, int ngayLamThem) {
        this.ten =ten;
        this.ngayLamThem = ngayLamThem;
    }
    public void setLoaiChucVu(int loaiChucVu) {
        this.loaiChucVu = loaiChucVu;
    }
    @Override
    public String loaiNhanVien() {
        if(loaiChucVu == 1) {
            return "Nhan Vien Full Time Sep";
        } else if (loaiChucVu == 2) {
            return "Nhan Vien Full Time Linh";
        } else{
            return "Khong phai nhan vien full time";
        }
    }
    public void tinhLuong(){
        if (loaiChucVu == 2) {
            luong = Configs.LUONG_NHAN_VIEN_FULL_TIME_LINH+Configs.LUONG_LAM_THEM_MOI_NGAY * ngayLamThem; 
        } else if (loaiChucVu == 1) {
            luong = Configs.LUONG_NHAN_VIEN_FULL_TIME_SEP+Configs.LUONG_LAM_THEM_MOI_NGAY * ngayLamThem; 
        }
    }
}
