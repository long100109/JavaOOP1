package Lists;

import java.util.ArrayList;
import java.util.Scanner;
public class ArrayListDemo extends Student{
    public static void main(String[] args) {
    ArrayList<Student>  studentList = new ArrayList<>();
    Scanner sc = new Scanner(System.in);   
        boolean isRunning = true;
        while (isRunning) {
            System.out.println("Chọn chức năng:");
            System.out.println("1. Thêm sinh viên");
            System.out.println("2. Hiển thị danh sách sinh viên");
            System.out.println("3. Sửa thông tin sinh viên");
            System.out.println("4. Xoá sinh viên");
            System.out.println("5. Thoát");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    ThemMoiThongTin();
                    break;
                case 2:
                    HienThiThongTin();
                    break;
                case 3:
                    SuaThongTint();
                    break;
                case 4:
                    XoaThongTin();
                    break;
                case 5:
                    isRunning = false;
                    break;
                default:
                    System.out.println("Lựa chọn không hợp lệ.");
            }
        }
    }

    private static void addStudent() {
        System.out.println("Nhập họ và tên của sinh viên:");
        String name = scanner.nextLine();
        System.out.println("Nhập tuổi của sinh viên:");
        int age = scanner.nextInt();
        scanner.nextLine(); // Clear buffer

        Student student = new Student(name, age);
        studentList.add(student);
        System.out.println("Sinh viên đã được thêm vào danh sách.");
    }

    private static void displayStudents() {
        if (studentList.isEmpty()) {
            System.out.println("Danh sách sinh viên trống.");
        } else {
            System.out.println("Danh sách sinh viên:");
            for (Student student : studentList) {
                System.out.println("Họ và tên: " + student.getName() + ", Tuổi: " + student.getAge());
            }
        }
    }

    private static void editStudent() {
        displayStudents();
        if (!studentList.isEmpty()) {
            System.out.println("Nhập số thứ tự của sinh viên bạn muốn sửa:");
            int index = scanner.nextInt();
            scanner.nextLine(); // Clear buffer

            if (index >= 0 && index < studentList.size()) {
                System.out.println("Nhập họ và tên mới của sinh viên:");
                String newName = scanner.nextLine();
                System.out.println("Nhập tuổi mới của sinh viên:");
                int newAge = scanner.nextInt();
                scanner.nextLine(); // Clear buffer

                studentList.get(i
}
