package Day2;

public class NestedForLoop {
    public static void main(String[] args) {

        for (int i = 1; i <= 3; i++) {
            System.out.println("Outer loop: " + i); // 3 times

            for (int j = 1; j <=3 ; j++) {
                System.out.println("Inner Loop: "+j); // 3 times
            }

        }

    }
}
