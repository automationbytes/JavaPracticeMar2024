package Day4;

public class Student1 {

    //datamembers- attributes
    String name;
    int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    void toStudy(){
        System.out.println(this.name + " studying and age is "+this.age);
    }

    public static void main(String[] args) {
        Student1 s1 = new Student1();
        s1.setName("Mahi");
        s1.setAge(7);
        s1.toStudy();


    }

    //mahi 7
    //virat 10
}
