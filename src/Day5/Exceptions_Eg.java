package Day5;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Exceptions_Eg {

    static void checkEligibilityforVoting(int age) throws Exception {
        if(age < 18){
            throw new Exception("You are not eligible for Voting");
        }
    }
    public static void main(String[] args) throws Exception {

        try{
            int[] arr ={5,7,8,9,1,2,7,9};
            System.out.println(arr[5]);
        }catch (Exception e){
            System.out.println("GOt an exception");
            e.printStackTrace();
        }
        finally {
            System.out.println("Finally executed");
        }

        Thread.sleep(5000);
        FileInputStream fileInputStream = new FileInputStream("C:\\Users\\vigne\\Desktop\\New Text Document.txt");
        fileInputStream.read();
        String pattern = "MMMM-dd-yyyy";
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
        String date = simpleDateFormat.format(new Date());
        System.out.println(date);


        checkEligibilityforVoting(5);
    }
}
