import java.util.Scanner;

/**
 * Created by Win7-64 SP1 on 4/23/2017.
 */
public class CaesarCipher {
    public static void main (String [] args){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        String text = scan.next();
        int k  = scan.nextInt();
        char [] characters = text.toCharArray();
        char [] result = new char[characters.length];
        for (int i = 0 ; i < characters.length ; i++){
            if ((characters[i] >= 'a' && characters[i]<= 'z') || (characters[i] >= 'A' && characters[i]<= 'Z')){
                if (Character.isLowerCase(characters[i])){
                    if (characters[i]  + k  > 122){
                       int example = characters[i] + k ;
                       while (example > 122) {
                           result[i] = (char) (example-26);
                           example-=26;
                       }
                    }
                    else {
                        result[i] = (char) (characters[i]+k);
                    }
                }
                else {

                    if (characters[i]  + k > 90 ){
                        int example = characters[i] + k ;
                        while (example > 90) {
                            result[i] = (char) (example-26);
                            example -=26;
                        }
                    }
                    else {
                        result[i] = (char) (characters[i] + k);
                    }

                }
            }
            else {
                result [i] = characters[i];
            }
        }
        for (int i = 0 ; i < result.length ; i++){
            System.out.print(result[i]);
        }
    }
}
