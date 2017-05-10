import java.util.Scanner;

/**
 * Created by Win7-64 SP1 on 4/28/2017.
 */
public class Input {
    public static void main (String [] args){
        int TC , a , b ;
        Scanner scan = new Scanner(System.in);
        TC = scan.nextInt();
        while (TC>0){
            a = scan.nextInt();
            b = scan.nextInt();
            System.out.println(a+b);
            TC--;
        }
    }
}
