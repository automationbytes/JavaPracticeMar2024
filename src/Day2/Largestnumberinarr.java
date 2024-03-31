package Day2;

import java.util.Arrays;

public class Largestnumberinarr {
    public static void main(String[] args) {

        int[] arr = {4,7,1,2,3,7,4,9};
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));

        //arr[arr.length-n]
        //secondlargest
        System.out.println(arr[arr.length-1]);

        //smallest number arr[n-1)
        System.out.println(arr[2-1]);
    }
}
