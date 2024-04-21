package Day6;

import java.util.*;

public class Array2Set {
    public static void main(String[] args) {
        String[] fruits = {"Apple","Grapes","Orange","PineApple","Banana"};

        //method2
        HashSet<String> set = new HashSet<>();
        Collections.addAll(set,fruits);
        System.out.println(set);
        set.add("Mango");
        System.out.println(set);

    }
}
