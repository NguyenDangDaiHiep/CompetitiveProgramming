/**
 * Created by Win7-64 SP1 on 4/30/2017.
 */
public class ReplacementString {
    public static  String replace (String a , String b){
        StringBuilder result = new StringBuilder();

        for (char c : a.toCharArray()){
            if (c == ' '){
                result.append(b);
            }
            else {
                result.append(c);
            }
        }
        a = result.toString();
        return a ;
    }
    public static void main (String [] args){
     String result = replace("This is a test","/");
     System.out.print(result);
    }
}
