package Day3;

public class WOStatic {

    int counter = 0;

    WOStatic(){
        counter++;
        System.out.println(counter); //w1- 1 w2-1 w3-1
    }

    public static void main(String[] args) {

        WOStatic w1 = new WOStatic();
        WOStatic w2 = new WOStatic();
        WOStatic w3 = new WOStatic();



    }
}
