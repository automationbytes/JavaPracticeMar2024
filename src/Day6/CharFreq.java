package Day6;

import java.util.LinkedHashMap;

public class CharFreq {

    //aaabbbccccdd - a3b3c4d2
    public static void main(String[] args) {
        String input = "Hello World"; //
        LinkedHashMap<Character,Integer> charFreq = new LinkedHashMap<>();
        for (char c : input.toCharArray()){
//            if(charFreq.containsKey(c)){
//                charFreq.put(c,charFreq.get(c)+1);
//            }else {
//                charFreq.put(c,1);
//            }

            charFreq.put(c,charFreq.getOrDefault(c,0)+1);

        }
        System.out.println(charFreq);
    }


}
