package Day6;

import java.util.HashSet;

/*
Insertion order is not guaranteed
(Random order - Insertion order is not preserved)
Random access is not possible
Only one null value is possible

1,2,3,4,5 -> 1,2,3,4,5
 */
public class HashSet_Eg {
    public static void main(String[] args) {

        HashSet<Integer> set = new HashSet<Integer>();
        set.add(5);
        set.add(50);
        set.add(15);
        set.add(25);
        set.add(59);
        set.add(57);
        set.add(5);
        set.add(40);
        System.out.println(set);

        for (Integer s : set){
            System.out.println(s);
            if(s == 40){

            }
        }

        set.add(51);
        System.out.println(set);

        HashSet<Integer> dupHashSet = (HashSet<Integer>) set.clone();
        System.out.println(dupHashSet);

        dupHashSet.clear();
        System.out.println(dupHashSet);

        System.out.println(set.contains(15));

        System.out.println(set.size());


    }
}
