package Day6;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class Looping_Eg {
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

        //normal for each loop
        for (Object s : set){
            System.out.println(s);
        }
        System.out.println("***");


        //collection for each
        set.forEach(i-> System.out.println(i));

        //Iterator
        System.out.println("***");

        Iterator i = set.iterator();
        while (i.hasNext()){
            System.out.println(i.next());
        }



        ArrayList al = new ArrayList();
        al.add(1);//0
        al.add(5);//1
        al.add(10); //2*3/2+1 ->4
        System.out.println(al);

        for (int j = 0; j < al.size(); j++) {
            System.out.println(al.get(j));
        }
    }
}
