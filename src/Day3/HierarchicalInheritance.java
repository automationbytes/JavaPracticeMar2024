package Day3;

class AnimalHI{
    void toeat(){
        System.out.println("Animal's eat method");
    }

}

class DogHI extends AnimalHI{
    void sleep(){
        System.out.println("Dog's sleep method");
    }
}

class CatHI extends AnimalHI {

    void sound(){
        System.out.println("Cats sound method");
    }
}

public class HierarchicalInheritance {
    public static void main(String[] args) {
        DogHI dogHI = new DogHI();
        dogHI.sleep();
        dogHI.toeat();

        CatHI catHI = new CatHI();
        catHI.sound();
        catHI.toeat();
       // catHI.sleep()


    }


}
