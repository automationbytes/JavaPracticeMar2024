package Day3;

public class callByvalueClass {
    int num = 10;

    void change(callByvalueClass c){
        c.num = c.num + 10;
    }

    public static void main(String[] args) {
        callByvalueClass c = new callByvalueClass();
        System.out.println("Before "+c.num);

        c.change(c);
        System.out.println("After "+c.num);

    }
}
