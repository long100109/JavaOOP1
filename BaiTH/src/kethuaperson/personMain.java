
package kethuaperson;
import kethuaperson.employees;
import kethuaperson.FulltimeEmployee;
import kethuaperson.ParttimeEmployee;
public class personMain {
    public static void main(String[] args) {
        FulltimeEmployee fulltime = new FulltimeEmployee("Dinh Duc Viet","Nam" , 20, "IT", 20, 200000);
        ParttimeEmployee parttime = new ParttimeEmployee("Ngo Thi Nga", "Nu", 20, "May", 30, 25000);
        System.out.println("Nhap thong tin nhan vien toan thoi gian");
        fulltime.input();
        System.out.println("Nhap thong tin nhan vien ban thoi gian");
        parttime.input();
        System.out.println("Thong tin nhan vien toan thoi gian");
        fulltime.output();
        System.out.println("Luong thang:"+fulltime.calculatesalary());
        System.out.println("Thong tin nhan vien ban thoi gian");
        parttime.output();
        System.out.println("Luong thang:"+parttime.calculatesalary());
    }
}  

