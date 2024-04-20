package Day5;

import java.util.ArrayList;

public class RemoveRange_Eg extends ArrayList<Integer>{
    public static void main(String[] args) {
        RemoveRange_Eg arr1 = new RemoveRange_Eg();
        //ArrayList<Integer> arr1 = new ArrayList<Integer>();
        arr1.add(1);//0
        arr1.add(2);//1
        arr1.add(3);//2
        arr1.add(4);//starts fromhere
        arr1.add(5);
        arr1.add(6);
        arr1.add(7);
        arr1.add(8);

        System.out.println(arr1);
//        arr1.removeRange(0,3);
//        System.out.println(arr1);

        System.out.println(arr1.subList(3,8));
    }
}
