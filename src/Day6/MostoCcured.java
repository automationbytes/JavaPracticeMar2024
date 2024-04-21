package Day6;

import java.util.LinkedHashMap;
import java.util.Map;

public class MostoCcured {
    public static void main(String[] args) {

        String input = "aaabbbbcccdddddd"; //a3b4c3d6
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


        char mostOccured = 0;
        int maxFreq = 0;//Integer.MIN_VALUE;

        //int- 4byte- 2^32 = -2147483648
        for (Map.Entry<Character,Integer> entry: charFreq.entrySet()){
            if(entry.getValue() > maxFreq){
                mostOccured = entry.getKey();
                maxFreq = entry.getValue();
            }
        }

        System.out.println(mostOccured);




    }
}
