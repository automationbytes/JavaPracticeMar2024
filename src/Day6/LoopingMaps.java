package Day6;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class LoopingMaps {
    public static void main(String[] args) {

        HashMap<String,Integer> map = new HashMap();
        map.put("One",1);
        map.put("Two",2);
        map.put("Three",3);
        map.put("Four",1);
        map.put("One",1111); //duplicating

        System.out.println(map);


        //for each loop - more easier way
        for(String k : map.keySet()){
            System.out.println(k+ "  "+map.get(k));
        }
        System.out.println(map);

        //normal for
        for(Map.Entry<String,Integer> entry : map.entrySet()){
            System.out.println(entry.getKey()+ "  "+entry.getValue());
        }

        System.out.println(map);

        //for-each collection
        map.forEach((k,v) -> System.out.println(k+ "  "+v));

        //iterator
        Iterator<Map.Entry<String,Integer>> iterator = map.entrySet().iterator();
        while (iterator.hasNext()){
            Map.Entry<String,Integer> entry = iterator.next();
            System.out.println(entry.getKey() + "  "+entry.getValue());
        }
    }
}
