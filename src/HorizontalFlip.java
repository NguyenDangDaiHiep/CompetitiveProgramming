/**
 * Created by Win7-64 SP1 on 4/30/2017.
 */
public class HorizontalFlip {
    public static  void flipHorizontalAxis (int[][] matrix){
     System.out.print(matrix[0].length - 1);
    }
    public static void main (String [] args){
          int [] [] matrix = {{1,2},{4,5},{7,8}};
          flipHorizontalAxis(matrix);
    }
}
