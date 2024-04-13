package Day3;

public class StaticBlck {

    static {
        System.out.println("Static block init");
    }

    public static void main(String[] args) {
        System.out.println("Main Methd Init"); //2nd
    }
}
