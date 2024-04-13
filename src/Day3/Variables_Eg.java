package Day3;

public class Variables_Eg {

    static int a1 = 99;
    int a = 20; //instance variable
    void sample(){
        int a = 10; //local variable
        System.out.println("Value from sample method : "+ a);
    }

    public static void main(String[] args) {
        int a = 15; //instance variable

        System.out.println("Value from main method : "+ a);

        Variables_Eg v = new Variables_Eg();
        System.out.println("Value from class : "+ v.a);

        v.sample();

        System.out.println(a1);
    }


}
