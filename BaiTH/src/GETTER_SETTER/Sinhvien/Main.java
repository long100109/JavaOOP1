package Sinhvien;
public class Main {
    public static void main(String[] args) {
        Sinhvien sv1=new Sinhvien();
        sv1.setTen("");
        sv1.setTuoi(23);
        Sinhvien sv2=new Sinhvien();
        sv2.setTen("Kien");
        sv2.setTuoi(30);
        System.out.println("Sinh vien 1 co ten la: "+sv1.getTen()+"; co tuoi la:"+sv1.getTuoi());
        System.out.println("Sinh vien 2 co ten la: "+sv2.getTen()+"; co tuoi la:"+sv2.getTuoi());
    }
}
