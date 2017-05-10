import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by Win7-64 SP1 on 5/6/2017.
 */
public class FirstUniqueCharacterString {
    public static int firstUniqChar (String s){
        HashMap<Character,Integer> result = new HashMap<Character,Integer>();
        for (int i = 0 ; i < s.length() ; i++){
           if (!result.containsKey(s.charAt(i))){
               result.put(s.charAt(i),1);
           }
           else {
               result.put(s.charAt(i),result.get(s.charAt(i))+1);
           }
        }

        if (!result.isEmpty()) {
            for (int i = 0 ; i < s.length() ; i++){
                if (result.get(s.charAt(i))==1){
                    return i ;
                }
            }
        }
       return - 1 ;
    }
    public static void main (String [] args){
       int result = firstUniqChar("loveleetcode");
       System.out.print(result);
    }
}
