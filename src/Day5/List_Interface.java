package Day5;

import java.util.ArrayList;

/*
List can be index based
list are ordered
List can allow duplicates

List can be modifiable/growable (it can increase it size in runtime)
List can store any datatypes (same/diff)
List can store null values

ArrayList
---------
Default Initial capacity - 10

New Memory allocation - 3/2+1
11 -> 10*3/2 +1 = 16
17-> 16*3/2 +1 = 25
 */
public class List_Interface {

    public static void main(String[] args) {

        ArrayList al = new ArrayList();
        al.add(1);//0
        al.add(5);//1
        al.add("Hi"); //2*3/2+1 ->4
        System.out.println(al);

        //add in specific position
        al.add(2,"Hello");
        System.out.println(al);

        //size -instead of length
        System.out.println(al.size());

        //remove
        al.remove(2);
        System.out.println(al);

        al.remove("Hi");
        System.out.println(al);

        al.clear();
        System.out.println(al);

        al.add(1);//0
        al.add(5);//1
        al.add(1);//0

        al.add("Hi"); //2*3/2+1 ->4
        System.out.println(al);

        //add in specific position
        al.add(2,"Hello");
        System.out.println(al);

        System.out.println(al.get(2));

        al.set(al.indexOf("Hello"),"Hello World");
        System.out.println(al);

      //  al.indexOf("Hello");
        System.out.println(al.indexOf("Hello World"));

        System.out.println(al.lastIndexOf("Hi"));

        System.out.println(al.contains("Hi"));

        System.out.println(al.indexOf(1));

        System.out.println(al.lastIndexOf(1));
        System.out.println(al);

    }
}
