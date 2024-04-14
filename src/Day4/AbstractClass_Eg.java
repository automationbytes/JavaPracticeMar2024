package Day4;

abstract class Fruits{
    abstract void taste(); //abstact  method

    //non abstract method
    void eat(){
        System.out.println("Lets eat fruits");
    }
}

class Mango extends Fruits{

    @Override
    void taste() {
        System.out.println("Mango is sweet");
    }
}


public class AbstractClass_Eg {
    public static void main(String[] args) {
        Mango m = new Mango();
        m.taste();
        m.eat();
    }
}
