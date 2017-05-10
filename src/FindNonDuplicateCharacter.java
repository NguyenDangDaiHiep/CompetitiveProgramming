import java.util.Enumeration;
import java.util.HashMap;
import java.util.Hashtable;

/**
 * Created by Win7-64 SP1 on 4/30/2017.
 */
public class FindNonDuplicateCharacter {
    public static Character firstNonRepeatedCharacter(String str) {
        HashMap<Character,Integer> characterhashtable = new HashMap<Character,Integer>();
        int i , length ;
        Character c ;
        length = str.length();
        for ( i = 0 ; i < length ; i++){
            c = str.charAt(i);
            if (characterhashtable.containsKey(c)){
             characterhashtable.put(c,characterhashtable.get(c) + 1);
            }
            else {
                characterhashtable.put(c,1);
            }
        }
        for (i = 0 ; i < length ; i++){
            c= str.charAt(i);
            if (characterhashtable.get(c) == 1){
                return c ;
            }
        }
        return null ;
    }
    public static  void main (String [] args){

    }
}
