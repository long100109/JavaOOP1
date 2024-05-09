import java.util.LinkedList;
public class Slide38Chg4 {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<String>();
        list.add("java");
        list.add("c++");
        list.add("php");
        System.out.println("Vi du su dung phuong thuc addAll()");
        LinkedList<String> listA = new LinkedList<String>();
        listA.addAll(list);
        System.out.println("listA:"+listA);
        System.out.println("vi du su dung phuong thuc retainAll()");
        LinkedList<String> listB = new LinkedList<String>();
        listB.add("java");
        listA.retainAll(listB);
        System.out.println("listA:"+listA);
        System.out.println("vi du su dung phuong thuc removeAll()");
        list.removeAll(listB);
        System.out.println("list:"+list);
    }
    public static void showList(LinkedList<String> list) {
        for (String obj : list) {
            System.out.println("\t"+obj+",");
        }
    System.out.println();
    }
}
