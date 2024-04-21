package Day6;

import java.util.LinkedHashMap;
import java.util.Map;

public class Compresschar {
    public static void main(String[] args) {

        String input = "aaabbbbcccdddd"; //a3b4c3d4
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

        StringBuilder compressed = new StringBuilder();
       // for (Map.Entry<Character,Integer> entry : charFreq.entrySet())
        for(Object m : charFreq.keySet()){
            compressed.append(m);
            if (charFreq.get(m) >1){
                compressed.append(charFreq.get(m));
            }

    }
        System.out.println(compressed.toString());


}
}
