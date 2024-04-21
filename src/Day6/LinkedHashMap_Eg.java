package Day6;

import java.util.HashMap;
import java.util.LinkedHashMap;

public class LinkedHashMap_Eg {
    public static void main(String[] args) {

        LinkedHashMap<String,Integer> map = new LinkedHashMap();
        map.put("One",1);
        map.put("Two",2);
        map.put("Three",3);
        map.put("Four",1);
        map.put("One",1111); //duplicating

        System.out.println(map);

    }
}
