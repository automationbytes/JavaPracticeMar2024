package Day3;
/*

Method/Functions - is a block of code which only runs when its called
We can pass the data as parameters.
return for the result

Used - reusability

accessmodifiers nonaccessmodifiers returndatatype methodname(parameters){

return statement
}

 */
public class Methods_Eg {

    public static int sum(int a, int b){
        return a+b;
    }


    public static void add(int a, int b){
        System.out.println(a+b);
    }

    public static void main(String[] args) {

        System.out.println(sum(5,10)*100);

        add(5,10);
    }

}
