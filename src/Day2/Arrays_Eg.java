package Day2;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

public class Arrays_Eg {
    public static void main(String[] args) {

        String[] fruits = {"Apple","Banana","Stawberry","Grapes","Papaya"};
       // Arrays.stream(fruits).sorted();
        Arrays.sort(fruits);
        System.out.println(Arrays.toString(fruits));

        int[] num = {5,7,9,1,2,6};
//        Arrays.sort(num);
//        System.out.println(Arrays.toString(num));

        int temp = 0;
        for (int i = 0; i < num.length; i++) {
            for (int j = i+1; j < num.length; j++) {
                if (num[i] < num[j]){
                    temp = num[i];
                    num[i] = num[j];
                    num[j]  = temp;
                }
            }
        }
        System.out.println(Arrays.toString(num));


        Integer[] arr = {5,7,9,1,2,6};
        //Arrays.sort(arr, Collections.reverseOrder());
        Arrays.sort(arr, Comparator.reverseOrder());

        System.out.println(Arrays.toString(arr));

    }

}
