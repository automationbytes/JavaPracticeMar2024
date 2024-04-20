package Day5;

import java.util.ArrayList;

public class RemoveAll_EG {
    public static void main(String[] args) {

        ArrayList arr1 = new ArrayList();
        arr1.add(1);
        arr1.add(2);
        arr1.add(3);
        arr1.add(4);
        arr1.add(5);



        ArrayList arr2 = new ArrayList();
        arr2.add(1);
        arr2.add(2);
        arr2.add(3);
        arr2.add(6);

//
//        arr1.removeAll(arr2);
//        System.out.println(arr1);
//
        arr1.retainAll(arr2);
        System.out.println(arr1);
    }
}
