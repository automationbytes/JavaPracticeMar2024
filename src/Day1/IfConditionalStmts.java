package Day1;

public class IfConditionalStmts {

    /*
    if(cond = true){
        block of code/statements
    }else{
        if false - it will execute else block
    }

     */

    public static void main(String[] args) {
        int num = 0;

        if(num > 0){
            System.out.println("Its a positive number");
        } else if (num == 0) {
            System.out.println("Number is Zero");
        } else {
            System.out.println("Its a negative number");
        }
    }
}
