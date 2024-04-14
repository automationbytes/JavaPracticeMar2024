package Day4;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class LocalDateTime_Eg {
    public static void main(String[] args) {

        LocalDateTime dateTime = LocalDateTime.now();
        String pattern = "MM-dd-yyyy";
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern(pattern);
        System.out.println(dateTime.format(formatter));
    }
}
