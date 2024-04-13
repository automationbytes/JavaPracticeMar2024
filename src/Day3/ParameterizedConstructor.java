package Day3;

public class ParameterizedConstructor {
    String coursename;
    int duration;

    ParameterizedConstructor(String coursename, int duration){
        this.coursename = coursename;//Java //Python
        this.duration = duration;//10 //15

    }

    public static void main(String[] args) {

        ParameterizedConstructor p1 = new ParameterizedConstructor("Java",10);
        System.out.println(p1.coursename);
        System.out.println(p1.duration);


        ParameterizedConstructor p2 = new ParameterizedConstructor("Python",15);
        System.out.println(p2.coursename);
        System.out.println(p2.duration);

    }

}
