import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by Win7-64 SP1 on 4/25/2017.
 */
public class CamelCase {
    public static void main (String [] args){
        Scanner in = new Scanner(System.in);
        String s = in.next();
        int counter = 1 ;
        char [] text = s.toCharArray();
        for (int i = 0 ; i < text.length ; i++){
            if (Character.isUpperCase(text[i])){
                counter++;
            }
        }
        System.out.print(counter);
    }
}
