package Day4;

enum DayofWeek{
    Monday,
    Tuesday,
    Wednesday,
    Thursday,
    Friday,
    Saturday,
    Sunday
}
public class Enum_Eg {
    public static void main(String[] args) {
        System.out.println(DayofWeek.Monday);

        for(DayofWeek d : DayofWeek.values()){
            System.out.println(d);
        }

    }
}
