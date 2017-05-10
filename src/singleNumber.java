import java.util.HashMap;

/**
 * Created by Win7-64 SP1 on 5/1/2017.
 */
public class singleNumber {
    public static int singleNumber (int [] A){
        int temp = 0 ;
        HashMap<Integer,Integer> result = new HashMap<Integer,Integer>();
        for (int i = 0 ; i < A.length ; i++){
            if (result.containsKey(A[i])){
                result.put(A[i],result.get(A[i])+1);
            }
            else {
                result.put(A[i],0);
            }
        }
        for (int i = 0 ; i < A.length ; i++){
            if (result.get(A[i]) == 0){
                temp = A[i];
                break;
            }
        }
      return temp ;
    }
    public static  void main (String [] args){

    }
}
