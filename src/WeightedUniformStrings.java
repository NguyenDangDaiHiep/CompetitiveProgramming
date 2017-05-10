import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

/**
 * Created by Win7-64 SP1 on 5/9/2017.
 */
public class WeightedUniformStrings {
    public static void main (String [] args){
        Scanner in = new Scanner(System.in);
        String s = in.next();
        int n = in.nextInt();
        HashMap<Character,Integer> memories = new HashMap<Character,Integer>();
        ArrayList<Integer> result = new ArrayList<Integer>();
        int [] alphabet = new int [26];
        Arrays.fill(alphabet,0);
        for (int i = 0 ; i < s.length() ; i++){
            alphabet[(int) s.charAt(i) - 26] ++ ;
        }
        int counter = 0 ;
        for (char i = 'a' ; i <= 'z' ; i++){
            memories.put(i,counter++);
        }
        for (int i = 0 ; i < alphabet.length ; i++){
            int temp = alphabet[i] ;
            while (temp > 0){

            }
        }

        for (int i = 0 ; i<n ; i++){

        }
    }
}
