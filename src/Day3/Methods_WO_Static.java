package Day3;

public class Methods_WO_Static {


    public int sum(int a, int b){
        return a+b;
    }


    public void add(int a, int b){
        System.out.println(a+b);
    }

    public static void main(String[] args) {

        Methods_WO_Static m = new Methods_WO_Static();
        System.out.println(m.sum(10,5));
    }

}
