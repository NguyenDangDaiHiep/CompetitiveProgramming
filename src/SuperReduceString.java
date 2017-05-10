import java.math.BigInteger;
import java.util.*;

/**
 * Created by Win7-64 SP1 on 4/21/2017.
 */
public class SuperReduceString {
    public static void main (String [] args){
       String text = "bbbaaaccddd";
       char [] characters = text.toCharArray();
        ArrayList<Character> array = new ArrayList<Character>();
        for (int i = 0 ; i < characters.length ; i++){
            if (!array.contains(characters[i])){
                array.add(characters[i]);
            }
            else {
                if (array.get(array.size()-1).equals(characters[i])){
                    array.remove(array.size()-1);
                }
                else {
                    array.add(characters[i]);
                }
            }
        }
        if (array.isEmpty()){
            System.out.print("Empty String");
        }
        else {
            for (int i = 0; i < array.size(); i++) {
                System.out.print(array.get(i));
            }
        }
    }
}
