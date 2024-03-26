package kethuahinhhoc;
import kethuahinhhoc.hinhchunhat;
import kethuahinhhoc.hinhtron;
import kethuahinhhoc.hinhtru;
import kethuahinhhoc.hinhvuong;
public class kethuahinhhocmain {
    public static void main(String[] args) {
        hinhtron htron = new hinhtron();
        htron.xuatTen();
        htron.nhapBanKinh();
        htron.tinhChuVi();
        htron.tinhDienTich();
        htron.inChuVi();
        htron.inDienTich();
        hinhtru htru = new hinhtru();
        htru.xuatTen();
        htru.nhapChieuCao();
        htru.tinhTheTich();
        htru.inTheTich();
        hinhchunhat hcn = new hinhchunhat();
        hcn.xuatTen();
        hcn.nhapChieuDai();
        hcn.nhapChieuRong();
        hcn.tinhChuVi();
        hcn.tinhDienTich();
        hcn.inChuVi();
        hcn.inDienTich();
        hinhvuong hv = new hinhvuong();
        hv.xuatTen();
        hv.nhapCanh();
        hv.tinhChuVi();
        hv.tinhDienTich();
        hv.inChuVi();
        hv.inDienTich();
    }
    
}
