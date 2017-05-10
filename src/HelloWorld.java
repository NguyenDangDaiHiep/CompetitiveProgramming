import java.util.ArrayList;
import java.util.Queue;
import java.util.Scanner;

/**
 * Created by Win7-64 SP1 on 4/19/2017.
 */
public class HelloWorld {
    public static  void main (String [] args){
        Scanner scan = new Scanner(System.in);
        String text = scan.nextLine();
        char[] example  = text.toCharArray();
        ArrayList<Character> array = new ArrayList<Character>();
        for (int i = 0 ; i < example.length ; i++){
            if (!array.contains(example[i])){
                array.add(example[i]);
            }
            else{
                for (int j = 0 ; j < array.size() ; j++){
                    if (array.get(j)==example[i]){
                        array.remove(j);
                    }
                }
            }
        }
        if (array.isEmpty()){
            System.out.print("Empty String");
        }
        else {
            for (int i = 0 ; i < array.size() ; i++){
                System.out.print(array.get(i));
            }
        }


    }
}
