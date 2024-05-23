import java.util.Set;
import java.util.Map;
import java.util.HashMap;
import java.util.TreeMap;
public class Slide86Chg4 {
    public static void main(String[] args) {
        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put("CSLT","Co so lap trinh");
        hashMap.put("C++","C++");
        hashMap.put("C#","C Sharp");
        Set < Map.Entry<String, String>> setHashMap = hashMap.entrySet();
        System.out.println("Cac entry co trong setHashMap:"+setHashMap);
    }
}
