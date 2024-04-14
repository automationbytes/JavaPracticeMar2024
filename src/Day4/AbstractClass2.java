package Day4;

abstract class Shape{

    abstract int calculateArea();

    abstract void display();

}

class rectangle extends Shape{

    int length;
    int width;

    public rectangle(int length, int width) {
        this.length = length;
        this.width = width;
    }

    @Override
    int calculateArea() {
        return length*width;
    }

    @Override
    void display() {
        System.out.println("Its rectangle");
    }
}

class square extends Shape{

    int length;

    public square(int length) {
        this.length = length;
       // this.width = width;
    }

    @Override
    int calculateArea() {
        return length*length;
    }

    @Override
    void display() {
        System.out.println("Its square");
    }
}

public class AbstractClass2 {
    public static void main(String[] args) {
        rectangle r = new rectangle(5,10);
        System.out.println(r.calculateArea());
    }
}
