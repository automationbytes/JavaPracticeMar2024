package Day5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class RemoveIF_eg {
    public static void main(String[] args) {

        ArrayList<Integer> arr1 = new ArrayList<Integer>();
        arr1.add(1);
        arr1.add(2);
        arr1.add(3);
        arr1.add(4);
        arr1.add(5);
        arr1.add(6);
        arr1.add(7);
        arr1.add(8);

        arr1.removeIf(a -> (a % 2 == 0));
        System.out.println(arr1);


        String[] fruits = {"Apple","Grapes","Orange","PineApple","Banana","Guava"};

        List<String> list1 = new ArrayList<>();
        Collections.addAll(list1,fruits);
        System.out.println(list1);

        list1.removeIf(a ->(a.charAt(0) == 'G'));
        System.out.println(list1);


    }
}
