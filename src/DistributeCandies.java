import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

/**
 * Created by Win7-64 SP1 on 5/7/2017.
 */
public class DistributeCandies {
    public static int disbuteCandies(int [] candies){
       HashSet<Integer> set = new HashSet<Integer>();
       for (int i : candies) {
           set.add(i);
       }
       return set.size() <= candies.length/2 ? set.size() : candies.length/2 ;
    }
    public static void main (String [] args){
          int [] temp = {1,1,2,3};
          int result = disbuteCandies(temp);
          System.out.print(result);
    }
}
