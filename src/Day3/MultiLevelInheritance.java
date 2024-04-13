package Day3;


class AnimalMI{
    void toeat(){
        System.out.println("Animal's eat method");
    }

}

class DogMI extends AnimalMI{
    void sleep(){
        System.out.println("Dog's sleep method");
    }
}

class BullDogMI extends DogMI{
    void breed(){
        System.out.println("Bulldog's breed methd");
    }
}
public class MultiLevelInheritance {
    public static void main(String[] args) {
        BullDogMI b = new BullDogMI();
        b.breed();
        b.sleep();
        b.toeat();
    }

}
