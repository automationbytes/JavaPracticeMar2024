package Day6;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class LinkedHashSet_Eg {
    public static void main(String[] args) {
        LinkedHashSet<Integer> set = new LinkedHashSet<Integer>();
        set.add(5);
        set.add(50);
        set.add(15);
        set.add(25);
        set.add(59);
        set.add(57);
        set.add(5);
        set.add(40);
        System.out.println(set);

    }

}
