package Hashing;

import java.util.HashMap;
import java.util.Set;

public class hashmapOps {
    public static void main(String[] args) {
        HashMap<String, Integer> hm = new HashMap<>();

        // insert
        hm.put("India", 100);
        hm.put("China", 189);
        hm.put("Asgard", 5);

        System.out.println(hm);

        // get
        int population = hm.get("India");
        System.out.println(population);

        // containsKey (whetehr a key exists or not)
        System.out.println(hm.containsKey("India"));
        // remove key and value
        hm.remove("India");

        Set<String> keys = hm.keySet();
        System.out.println(keys);
    }
}
