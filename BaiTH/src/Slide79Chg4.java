import java.util.HashMap;
import java.util.TreeMap;

import javax.naming.spi.DirObjectFactory;

public class Slide79Chg4 {
    public static void main(String[] args) {
        HashMap<Integer, Float> hashMap1 = new HashMap<>();
        HashMap<String, String> hashMap2 = new HashMap<>(10);
        HashMap<Double, Double> hashMap3 = new HashMap<>(4, 0.75f);
        HashMap<Float, Integer> hashMap4 = new HashMap<>(new TreeMap<>());
    }
}