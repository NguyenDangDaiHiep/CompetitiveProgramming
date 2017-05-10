import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by Win7-64 SP1 on 4/28/2017.
 */
public class TEXQuotes {
    public static  void solution (String lines){
        StringBuffer result = new StringBuffer();
        boolean check = true ;
        for (char c : lines.toCharArray()){
            if (c == '"' && check == true){
                result.append("``");
                check = false ;
            }
            else  if (c== '"' && check == false){
                result.append("''");
                check = true ;
            }
            else {
                result.append(c);
            }
        }
        System.out.println(result);
    }
    public static void main (String [] args){
        Scanner scan = new Scanner(System.in);
        while (scan.hasNextLine()){
            solution(scan.nextLine());
        }

    }
}
