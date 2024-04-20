package Day5;

import java.util.*;

public class Array2ArrayList {
    public static void main(String[] args) {
        String[] fruits = {"Apple","Grapes","Orange","PineApple","Banana"};
        int[] arr = {1,2,3};
        //method 1- not suggested way (not recommended)
        List<String> list = Arrays.asList(fruits);
        System.out.println(list);

        //method2
        List<String> list1 = new ArrayList<>();
        Collections.addAll(list1,fruits);
        System.out.println(list1);
        list1.add("Mango");
        System.out.println(list1);

        //method3
        List<String> list2 = new ArrayList<>();
        for (String f : fruits){
            list2.add(f);
        }
        System.out.println(list2);






    }
}
