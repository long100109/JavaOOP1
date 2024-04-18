package Hinhtron;
public class Main {
    public static void main(String[] args) {
        Hinhtron ht = new Hinhtron();
        ht.setBanKinh(10);
        float chuvi=ht.tinhChuVi();
        float dientich=ht.tinhDienTich();
        System.out.println(" Chu vi = "+chuvi+"; Dien tich = "+dientich);
    }
}
