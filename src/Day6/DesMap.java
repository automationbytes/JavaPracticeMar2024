package Day6;

import java.util.NavigableMap;
import java.util.TreeMap;

public class DesMap {
    public static void main(String[] args) {
        NavigableMap<String, Integer> map = new TreeMap<String,Integer>().descendingMap();
        map.put("One",1);
        map.put("Two",2);
        map.put("Three",3);
        map.put("Four",1);
        map.put("One",1111); //duplicating

        System.out.println(map);
    }
}
