package Day3;

public class callByValueMethd {

    int num = 10;

    void change(int num){
        num = num + 10; //calc //
    }

    public static void main(String[] args) {
        callByValueMethd c = new callByValueMethd();
        System.out.println("Before "+c.num);
        c.change(100);
    //    System.out.println(c.change(100));
        System.out.println("After "+c.num);

    }
}
