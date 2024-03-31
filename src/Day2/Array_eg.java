package Day2;

import java.util.Arrays;

public class Array_eg {
    public static void main(String[] args) {

        int[] arr = {4,7,8,9,10,4,3};
        System.out.println(arr);

        System.out.println(Arrays.toString(arr));

        int[] arr1 = new int[5];
        arr1[0] = 5;
        arr1[1] = 4;
        arr1[2] = 5;
        arr1[3] = 4;
        arr1[4] = 5;
       // arr1[5] = 4;
        System.out.println(Arrays.toString(arr1));

        //loop
        for (int i = 0; i < arr.length; i++) {
            System.out.print (arr[i]+ " ,");
        }

        //for each
        for (int a : arr){
            System.out.println(a);
        }


        String[] fruits = {"Apple","Banana","Stawberry"};
        for (String f : fruits){
            System.out.println(f);
        }

    }
}
