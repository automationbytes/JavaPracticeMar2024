package Day2;

import java.util.Arrays;

public class String_Eg {
    public static void main(String[] args) {
        String s1 = "Hello";
        String s2 = "Hello";
        //== - it check values and memory
        System.out.println(s1 == s2);


        String s3 = new String("Hello");
        String s4 = new String("Hello");

        System.out.println("s1 ==s3"+ (s1 == s3));

        //equal - only value
        System.out.println("s1.equals(s4)"+s1.equals(s4));

        String s5 = "HELLO";
        System.out.println(s1.equals(s5));

        //equalsignorecase
        System.out.println(s1.equalsIgnoreCase(s5));

        //compare
        String a = "123";
        String b = "129";
        System.out.println(a.compareTo(b));

        String c = "abc";//97 98 99
        String d = "abf";//97 98 102
        System.out.println(c.compareTo(d));

        //uppercase
        String e = "Elephant";
        System.out.println(e.toUpperCase());

        //lowercase
        String f = "FISH";
        System.out.println(f.toLowerCase());

        //charAt - position
        String g = "Apple is pink"; //G-0 o-1...
        System.out.println(g.charAt(4));

        //index of - reverse of char At
        System.out.println(g.indexOf("p"));

        //last index of
        System.out.println(g.lastIndexOf("p"));

        System.out.println(g.indexOf("p",3));


        String h = "Horse is running fastly";
        //contains
        System.out.println(h.contains("ir"));

        //starts-wth
        System.out.println(h.startsWith("H"));
        System.out.println(h.startsWith("H",2));

        //ends-with
        System.out.println(h.endsWith("z"));

        //replace
        System.out.println(h.replace(" ","-"));

        //split array
        String[] ar = h.split(" ");
        System.out.println(Arrays.toString(ar));

        //toCharArray
        char[] ch = h.toCharArray();
        System.out.println(Arrays.toString(ch));

        //concat
        String p = "Princess";
        String q = "Queen";
        System.out.println(p.concat(q));
        System.out.println(p+q);

        //trim - cutting down the white spaces
        String r = "  Red   roses      ";
        System.out.println(r.trim()); //from front and back

        System.out.println(r.strip()); //same like trim.

        //leadstrip - left trim
        System.out.println(r.stripLeading());

        //right trim
        System.out.println(r.stripTrailing());

        //substring
        System.out.println(r.substring(2,5));

        //isblank
        String z = "   ";
        System.out.println(z.isBlank());
        System.out.println(z.isEmpty());
        System.out.println(z.length());


    }
}
