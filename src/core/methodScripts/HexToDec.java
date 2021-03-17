package core.methodScripts;

import java.util.*;

public class HexToDec {
    
    public int hexConverter(String input){
        int result=0;
        StringBuilder iptStore=new StringBuilder();
        iptStore.append(input);
        char[] splitter=iptStore.reverse().toString().toCharArray();
        
        HashMap<Character, Integer> hexLetters=new HashMap<>();
        char currentChar='A';
        int letterVal=10;
        
        while (letterVal<=15){
            hexLetters.put(currentChar, letterVal);
            currentChar++;
            letterVal++;
        }
        
        //Collections.reverse(Arrays.asList(splitter));
        for (int i=(splitter.length-1); i>=0; i--){
            if(Character.isDigit(splitter[i])){
                result+=Character.getNumericValue(splitter[i])*(int)Math.pow(16, i);
            } else {
                result+=hexLetters.get(splitter[i])*(int)Math.pow(16, i);
            }
        }
        
        return result;
    }
}
