import java.util.Scanner;
public class lab3hinhtron {
    public final float PI=3.14f;
    public float r, cv, dt;   
    Scanner sc = new Scanner(System.in);
    public  void nhapbankinh() {      
        System.out.print("Ban kinh: ");
        r = sc.nextFloat();
    }
   public void tinhchuvi() {
     cv =r * 2 * PI;
   }
   public void tinhdientich() {
     dt = r * r * PI;
   }
   public void inchuvi() {
    System.out.println("Chu vi:"+ cv);
   }
   public void indientich() {
    System.out.println("Dien tich:"+ dt);
   } 
}