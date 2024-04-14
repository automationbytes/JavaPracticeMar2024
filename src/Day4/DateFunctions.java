package Day4;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateFunctions {
    public static void main(String[] args) {

        String pattern = "MMMM-dd-yyyy";
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
        String date = simpleDateFormat.format(new Date());
        System.out.println(date);


    }
}
