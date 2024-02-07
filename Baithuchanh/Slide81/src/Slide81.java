import java.util.Scanner;
public class Slide81 {
public static void main(String[] args) {
    int c,h;
    Scanner sc = new Scanner(System.in);
    System.out.print("Nhap so cot : ");
    c = sc.nextInt();
    System.out.print("Nhap so hang : ");
    h = sc.nextInt();
    int A[][] = new int[c][h];
    System.out.println("Nhap cac phan tu cua ma tran :");
    for (int i = 0; i < c; i++) {
        for (int j = 0; j < h; j++) {
          System.out.print("Nhap phan tu thu   ["+i+"]["+j+"]:");
        A[i][j] = sc.nextInt();
        }
    }
    int max = A[0][0];
    for (int i = 0; i < c; i++) {
        for (int j = 0; j < h; j++) {
            if( max < A[i][j]) {
                max = A[i][j];
            }
}
    sc.close();
}
System.out.println("Phan tu lon nhat trong ma tran la : " + max );
}
}