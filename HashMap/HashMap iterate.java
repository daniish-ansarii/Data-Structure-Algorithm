import java.util.HashMap;
import java.util.Set;

public class hashIterate {
    public static void main(String args[]) {
        HashMap<String, Integer> hm = new HashMap<>();
        hm.put("India", 100);
        hm.put("China", 150);
        hm.put("US", 50);
        hm.put("Indonesia", 6);
        hm.put("Nepal", 5);

        //Iterate
        Set<String> keys = hm.keySet();
        System.out.println(keys);

        // Iterate only String
        for (String k : keys) {
            System.out.println("key = " + k + "value = " + hm.get(k));
        }

        // Iterate on Pairs
        for (HashMap.Entry<String, Integer> e : hm.entrySet()) {
            System.out.println(e.getKey() + " " + e.getValue());
        }
    }
}
