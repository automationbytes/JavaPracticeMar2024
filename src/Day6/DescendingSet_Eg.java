package Day6;

import java.util.TreeSet;

public class DescendingSet_Eg {
    public static void main(String[] args) {
        TreeSet<Integer> set = (TreeSet<Integer>) new TreeSet<Integer>().descendingSet();
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
