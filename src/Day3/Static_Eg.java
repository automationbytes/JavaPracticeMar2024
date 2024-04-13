package Day3;

public class Static_Eg {
    static int counter = 0;//1//2

    Static_Eg() {
        counter++;//1++//2++
        System.out.println(counter); //w1- 1 w2-2 w3-3
    }

    public static void main(String[] args) {

        Static_Eg w1 = new Static_Eg();
        Static_Eg w2 = new Static_Eg();
        Static_Eg w3 = new Static_Eg();


    }
}