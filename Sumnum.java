package stringconsecutive;

/**
 *
 * @author dell
 */
public class Stringconsecutive {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[] arr={0,1,2,3,4,5};
        System.out.println(sumnum(arr, arr.length-1));
        
    }
    public static int sumnum(int[] arr,int i){
        if (i==0) {
            return arr[0];
        }
        return arr[i]+sumnum(arr,i-1);
            
        }
    
    }
