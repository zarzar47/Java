package javaapplication26;

/**
 *
 * @author dell
 */
public class JavaApplication26 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[] arr={100,2,3,1,5,6,7};
        System.out.println(max(arr,arr.length-1));
    }
    public static int max(int[] arr, int i){
        if (i==0){
            return arr[0];
        }
            return Math.max(arr[i],max(arr,i-1));
    
    
    }
}
