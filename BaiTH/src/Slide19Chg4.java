import java.util.ArrayList;
import java.util.Iterator;
public class Slide19Chg4 {
    public static void main(String[] args) {
        ArrayList<Float> arrListFloat = new ArrayList<>();
        arrListFloat.add(0.7f);
        arrListFloat.add(0.9f);
        arrListFloat.add(1.7f);
        arrListFloat.add(2.7f);
        Iterator<Float> iterator = arrListFloat.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
