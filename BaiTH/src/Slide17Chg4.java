import java.util.ArrayList;

public class Slide17Chg4 {
    public static void main(String[] args) {
        ArrayList<String> arrListString = new ArrayList<>();
        arrListString.add("Java");
        arrListString.add("C#");
        arrListString.add("C++");
        System.out.println("Cac phan tu co trong arrListString la:");
        for(int i = 0; i < arrListString.size(); i++) {
            System.out.println(arrListString.get(i));
        }
    }
}
