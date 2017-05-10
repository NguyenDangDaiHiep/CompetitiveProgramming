import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by Win7-64 SP1 on 4/26/2017.
 */
public class LoveLetterMystery {
   public static  void main (String [] args){
      Scanner scan = new Scanner(System.in);
      int n = scan.nextInt();
     for (int i = 0 ; i < n ; i++){
         String lines = scan.nextLine() ;
         int counter = 0 ;
         for (int j = 0 ; j < lines.length() ; j++){
             counter += Math.abs(lines.charAt(i) - lines.charAt(lines.length()-1-i));
         }
         System.out.println(counter);
     }
   }
}
