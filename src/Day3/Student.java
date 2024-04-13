package Day3;

public class Student {

    //datamembers- attributes
    String name;
    int age;

    Student(String name, int age){
        this.name = name;
        this.age = age;
    }

    void toStudy(){
        System.out.println(this.name + " studying and age is "+this.age);
    }

    public static void main(String[] args) {
        Student s1 = new Student("Mahi",7);
        s1.toStudy();

        Student s2 = new Student("Virat",10);
        s2.toStudy();

        Student s3 = new Student("Rohit",9);
        s3.toStudy();

    }

    //mahi 7
    //virat 10
}
