import java.util.ArrayList;
import java.util.HashMap;

/**
 * Created by Win7-64 SP1 on 5/1/2017.
 */
public class duplicate {
    public static String duplicate (int [] numbers){
        HashMap<Integer,Integer> temp = new HashMap<Integer,Integer>();
        ArrayList<Integer> result = new ArrayList<Integer>();
        for (int i = 0 ; i < numbers.length ; i++){
            if (temp.containsKey(numbers[i])){
                temp.put(numbers[i],temp.get(numbers[i]) + 1);
            }
            else {
                temp.put(numbers[i], 0);
            }
        }
        for (int i = 0 ; i < numbers.length ; i++){
            if (temp.get(numbers[i]) > 0 && !result.contains(numbers[i])){
                result.add(numbers[i]);
            }
        }
      return result.toString();
    }
    public static  void main (String [] args){

    }
}
