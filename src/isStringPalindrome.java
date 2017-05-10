/**
 * Created by Win7-64 SP1 on 4/30/2017.
 */
public class isStringPalindrome {
    public static boolean solution (String str){
        String result = "" ;
        for (int i = str.length()-1  ; i >= 0 ; i--){
            result+= str.charAt(i);
        }
        return str.equals(result);
    }
    public static void main (String [] args){
     Boolean result = solution("madam");
     System.out.print(result);
    }
}
