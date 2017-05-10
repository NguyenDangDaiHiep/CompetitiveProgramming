import java.util.Scanner;

/**
 * Created by Win7-64 SP1 on 4/24/2017.
 */
public class MarsExploration {
    public static  void main (String [] args){
        Scanner in = new Scanner(System.in);
        String S = in.next();
        char [] text = S.toCharArray();
        int counter = 0 ;
        String result = new String();
        for (int i = 0 ; i < S.length()/3 ; i++){
            result+="SOS";
        }
        char [] text2 = result.toCharArray();
        for (int i = 0 ; i < text.length ; i++){
            if (text[i] != text2[i]){
                counter++;
            }
        }
        System.out.print(counter);




    }
}
