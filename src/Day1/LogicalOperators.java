package Day1;

public class LogicalOperators {
    public static void main(String[] args) {
        /*

        And - &&
        true and true = true
        true and false = false
        false and true = false
        false and false = false

        OR - ||
        true or true = true
        true or false = true
        false or true = true
        false or false = false


        Not - !
        true -> false
        false -> true

         */

        int a = 10;
        int b = 5;
        int c = 1;

        System.out.println(a < b && a < c);


        System.out.println(a < b || a < c);

        System.out.println(!(a == c));

    }
}
