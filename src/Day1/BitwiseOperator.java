package Day1;

public class BitwiseOperator {
    public static void main(String[] args) {
        int a = 12; //     1100
        int b = 5; //      0101

        System.out.println(a & b); //0100

        System.out.println(a | b); //1101

        /*
        & - Binary and - xand
        | - Binary or - xor

        1 and 1 = 1
        1 and 0 = 0
        0 and 1 = 0
        0 and 0 = 0

        1 or 1 = 1
        0 or 1 = 1
        1 or 0 = 1
        0 or 0 = 0

         */
    }
}
