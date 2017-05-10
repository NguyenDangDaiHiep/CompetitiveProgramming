import java.util.Scanner;

/**
 * Created by Win7-64 SP1 on 4/28/2017.
 */
public class Input3 {
    public static void main (String [] args){
        int a , b , c= 1 ;
        Scanner scan = new Scanner(System.in);
        while (scan.hasNextInt()){
            a = scan.nextInt();
            b = scan.nextInt();
            System.out.println("Case " + c++ + " " + a+b );
        }
    }
}
