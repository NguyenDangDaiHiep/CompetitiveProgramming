import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

/**
 * Created by Win7-64 SP1 on 4/21/2017.
 */
public class LambdaExpression {
    public static  void evaluate (List<Integer> list , Predicate<Integer> predicate){
        for (Integer n : list){
            if (predicate.test(n)){
                System.out.print(n+" ");
            }
        }
    }
    public static void main (String [] args){
        List<Integer> list = Arrays.asList(1,2,3,4,5,6,7);
        list.forEach(n->System.out.print(n));
    }
}
