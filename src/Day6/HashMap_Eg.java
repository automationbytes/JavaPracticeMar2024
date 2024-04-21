package Day6;

import java.util.HashMap;

public class HashMap_Eg {
    public static void main(String[] args) {

        HashMap<String,Integer> map = new HashMap();
        map.put("One",1);
        map.put("Two",2);
        map.put("Three",3);
        map.put("Four",1);
        map.put("One",1111); //duplicating

        System.out.println(map);

        System.out.println(map.get("Three"));

        //size
        System.out.println(map.size());

        //replace
        map.replace("Four",44);
        System.out.println(map);

        //getordefault
        Integer a = map.getOrDefault("Three",33);
        System.out.println(a);

        Integer a1 = map.getOrDefault("Five",5);
        System.out.println(a1);

        System.out.println(map.containsKey("Three"));
        System.out.println(map.containsValue("33"));

        //streams - manipulating






    }
}
