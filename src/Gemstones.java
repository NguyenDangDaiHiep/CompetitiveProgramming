import java.util.*;

/**
 * Created by Win7-64 SP1 on 4/26/2017.
 */
public class Gemstones {
    public static void main (String [] args){
      Scanner scan = new Scanner(System.in);
      int n = scan.nextInt() ;
      int subn = n ;
      int [] alphabet = new int [26];
      Arrays.fill(alphabet,0);
      int counter = 0 ;
      ArrayList<Character> temp = new ArrayList<Character>();
      while (subn>=0){
          String line = scan.nextLine();
          for (char c : line.toCharArray()){
              if (!temp.contains(c)){
                  temp.add(c);
              }
          }
          for (int i = 0 ; i < temp.size() ; i++){
              alphabet[temp.get(i) - 'a']++ ;
          }
          subn-- ;
          temp.clear();
      }
     for (int i = 0 ; i < alphabet.length ; i++){
          if (alphabet[i] == n){
              counter++;
          }
     }
     System.out.print(counter);
    }
}
