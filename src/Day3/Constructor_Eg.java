package Day3;
/*
Constructor used to create the instance of the class
- will be similar to methods
but differs in 2 ways
1) it doesnt have any return type
2) name of constructors should be same as class name

3 types of constructor

1) Default constructor - we are not going to provide any values.
automatically the values will be assigned to the variables in memory

2) No Arg constructor - Hard code the values to the variables

3) Parameterized constructor - provide the values in runtime during object declartion

 */
public class Constructor_Eg {

    int a;
    String b;
    String d;
    float c;

    public Constructor_Eg(){
        System.out.println("Constructor is initiated");
    }

    public static void main(String[] args) {

        Constructor_Eg c = new Constructor_Eg();
        System.out.println(c.a);
        System.out.println(c.b);
        System.out.println(c.d);

        System.out.println(c.b + c.d);


        System.out.println(c.c);


    }


}
