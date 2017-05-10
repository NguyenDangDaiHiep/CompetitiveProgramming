import java.util.Scanner;

/**
 * Created by Win7-64 SP1 on 5/8/2017.
 */
public class BeautifulBinaryString {
    public static int minSteps(int n , String B){
        int counter = 0 ;
        for (int i = 0 ; i < B.length()-2 ; i++){
            if (B.substring(i,i+3).equals("010")){
                counter ++ ;
                 i+=2;
            }
        }
        return counter ;
    }
    public static  void main (String [] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String B = in.next();
        int result = minSteps(n,B);
        System.out.println(result);
    }
}
