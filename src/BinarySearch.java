/**
 * Created by Win7-64 SP1 on 4/30/2017.
 */
public class BinarySearch {
    public static boolean binarySearch (int [] arr , int n){
        int left = 0 ;
        int right = arr.length - 1 ;

        while (left <= right){
            int mid = (right + left)/2;
            if (arr [mid] == n){
                return true ;
            }
            else if (arr[mid] < n){
                left = mid + 1 ;
            }
            else if ( arr [mid] > n ) {
                right = mid - 1 ;
            }
        }
        return false ;
    }
    public static  void main (String [] args){

    }
}
