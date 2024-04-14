package Day4;

public class Overloading_Eg {

    int sum(int a, int b){
        return a+b;
    }

    int sum(int a, int b, int c){
        return a+b+c;
    }

    float sum(float a, float b){
        return a+b;
    }

    String sum(String a, String b){
        return a+b;
    }

    public static void main(String[] args) {
        Overloading_Eg o = new Overloading_Eg();
        System.out.println( o.sum(5,6,9));
    }
}
