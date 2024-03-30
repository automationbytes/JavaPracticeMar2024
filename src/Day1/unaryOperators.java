package Day1;
//one variable
public class unaryOperators {
    public static void main(String[] args) {
        int i = 10;
        //i++ => i+1-> assignment - increment
        System.out.println(i++);//10
        System.out.println(i);//11

        //++i -> 1+i -> increment - assignment
        int j = 10;
        System.out.println(++j);//11
        System.out.println(j);//11
    }
}
