import java.util.ArrayList;

/**
 * Created by Win7-64 SP1 on 4/30/2017.
 */
public class UniqueCharsInString {
    public static  boolean areAllCharactersUnique(String str){
        ArrayList<Character> result = new ArrayList<Character>();
        for (char c : str.toCharArray()){
            if (!result.contains(c)){
                result.add(c);
            }
            else {
                return false ;
            }
        }
        return  true ;
    }
    public static  void main (String [] args){

    }
}
