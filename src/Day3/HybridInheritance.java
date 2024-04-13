package Day3;


class AnimalHY{
    void toeat(){
        System.out.println("Animal's eat method");
    }

}

class DogHY extends AnimalHY{
    void sleep(){
        System.out.println("Dog's sleep method");
    }
}


class BullDogHY extends DogHY{
    void breed(){
        System.out.println("Bulldog's breed methd");
    }
}

class CatHY extends AnimalHY {

    void sound(){
        System.out.println("Cats sound method");
    }
}


public class HybridInheritance {
    public static void main(String[] args) {
        BullDogHY b = new BullDogHY();
        b.breed();
        b.sleep();
        b.toeat();

        CatHY c = new CatHY();
        c.sound();
        c.toeat();
    }
}
