import java.util.Scanner;

/**
 * Created by Win7-64 SP1 on 4/28/2017.
 */
public class Input4 {
    public static  void main (String [] args){
        Scanner scan = new Scanner(System.in);
        int k , ans , v ;
        while (scan.hasNextInt()){
            k = scan.nextInt();
            ans = 0 ;
            while (k > 0){
              v = scan.nextInt();
             ans+=v ;
                k--;
            }
            System.out.println(ans);
        }
    }
}
