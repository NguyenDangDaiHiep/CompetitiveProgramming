import java.util.StringTokenizer;

/**
 * Created by Win7-64 SP1 on 5/4/2017.
 */
public class StringTokenizers {
    public static void main (String [] args){
        String example = "Facebook Internship";
        StringTokenizer result = new StringTokenizer(example," ");
        while (result.hasMoreTokens()){
            System.out.println(result.nextToken());
        }
    }
}