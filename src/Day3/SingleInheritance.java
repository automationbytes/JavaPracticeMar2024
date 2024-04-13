package Day3;

class AnimalSI{
    void toeat(){
        System.out.println("Animal's eat method");
    }

}

class DogSI extends AnimalSI{
    void sleep(){
        System.out.println("Dog's sleep method");
    }
}
public class SingleInheritance {
    public static void main(String[] args) {
//        AnimalSI a = new AnimalSI();
//        a.toeat();

        DogSI d = new DogSI();
        d.sleep();
        d.toeat();
    }
}
