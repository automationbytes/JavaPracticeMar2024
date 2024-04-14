package Day4;

public class Regex_Eg {
    public static void main(String[] args) {

        String a = "abc45649qwe";

        String num = a.replaceAll("[a-zA-Z]","");
        System.out.println(num);

        String num1 = a.replaceAll("\\D","");
        System.out.println(num1);

        String alb = a.replaceAll("[0-9]","");
        System.out.println(alb);

        String alb1 = a.replaceAll("\\d","");
        System.out.println(alb1);


       // String s = "";

        StringBuilder s = new StringBuilder();
        for(char arr : a.toCharArray()){ // [a,b,c,4,5,6,4,9,q,w,e]
            if(Character.isDigit(arr)){
                //s.concat(arr);
                s.append(arr);
            }
        }
        System.out.println(s);



    }
}
