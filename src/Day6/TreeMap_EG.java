package Day6;

import java.util.LinkedHashMap;
import java.util.TreeMap;

public class TreeMap_EG {
    public static void main(String[] args) {
        TreeMap<String,Integer> map = new TreeMap();
        map.put("One",1);
        map.put("Two",2);
        map.put("Three",3);
        map.put("Four",1);
        map.put("One",1111); //duplicating

        System.out.println(map);
    }
}
