import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by Win7-64 SP1 on 4/26/2017.
 */
public class Pangrams {
    public static void main (String [] args){
        Scanner scan = new Scanner(System.in);
         int [] alphabet = new int [26] ;
        ArrayList<Character> temp = new ArrayList<Character>();
        String line = scan.nextLine() ;
        boolean check = true ;
        for (char c : line.toCharArray()){
            if (Character.isUpperCase(c) && c != ' '){
                c = Character.toLowerCase(c);
                temp.add(c);
            }
            else if (Character.isLowerCase(c) && c != ' ') {
                temp.add(c);
            }
        }
        for (int i = 0 ; i < temp.size() ; i++){
            alphabet[temp.get(i) - 'a']++ ;
        }
        for (int i = 0 ; i < alphabet.length ; i++){
            if (alphabet[i] == 0){
                check = false ;
                break;
            }
        }
        if (check == true){
            System.out.print("pangram");
        }
         else {
            System.out.print("not pangram");
        }

    }
}
