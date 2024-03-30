package Day1;

/*

Variables - Containers to store value
Datatypes - To determine what type of data to be stored
            Size (How much)

Primitive Datatype -> Small letters
 (whole numbers)
byte - 1 byte - > 8 bits -> 2^8 -> 256=> -128 to 127 (0 will be considered as +ve)
short - 2 bytes - 16 bits - > 2^16 -> 65536 = > -32768 to 32767
int - 4 bytes - 32 bits
long - 8 bytes

float - 4 bytes (decimal numbers)
double - 8 bytes (decimal numbers)

boolean - 1 bit -> true/ false
char - 2 bytes -> single char

Non Primitive Datatype  - > Captial letters (upper cases_)

 */
public class Variables {

    public static void main(String[] args) {
        //datatype variablename = value
        byte b =  13; //-128 -127 -126
        System.out.println(b);

        short s = 5464;
        System.out.println(s);

        int i = 46544979;
        System.out.println(i);

        long l = 48694798797956l;
        System.out.println(l);

        float f = 54684.4987f;
        System.out.println(f);

        double d = 4897979797979.7897;
        System.out.println(d);

        char c = 'a';
        System.out.println(c);

        boolean bool = true;
        System.out.println(bool);
    }

}
