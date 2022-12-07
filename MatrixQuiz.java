package matrixquiz;

import java.util.Scanner;

/**
 *
 * @author Rafay Ahmed
 */
public class MatrixQuiz {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input=new Scanner(System.in);
        System.out.println("Enter number of rows ");
        int row=input.nextInt();
        
        //int[][] matrix=new int[row][row];
        int[][] matrix={
            {1,0,1,0,1},
            {1,1,1,1,1},
            {1,1,1,1,1},
            {1,1,1,1,1},
            {1,1,1,1,1}
        
        };
        System.out.println("Enter each value ");
        
       /* for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                matrix[i][j]=input.nextInt();
                
            }
            input.nextLine();
        }
       */ display(matrix);
        int[] wow=findLargestmatrix(matrix);
        System.out.printf("The largest matrix's point begins at row %d col %d and of size %d",wow[0],wow[1],wow[2]);
        System.out.println();
    }
    public static int[] findLargestmatrix(int[][] arr){
        int[] rows={0,0,0};
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                int count=findrows(arr,i,j);
                if (count>2) {
                    if (issquare(arr,count,i,j)==true) {
                        if (count>rows[2]) {
                            rows[2]=count;
                            rows[1]=j;
                            rows[0]=i;
                        }
                    }
                }
                
            }
            
        }
    return rows;
    }
    public static int findrows(int[][] arr,int i ,int j){
        int count=0;
        try {
        while (arr[i][j]==1){
        count++;
        j++;
        
        }
        }
        catch (Exception ex){
        }
        //System.out.println("count"+count);
        return count;
    
    }
    public static boolean issquare(int[][] arr,int count,int i,int j){
        int count2=0;
        boolean bad=false;
        try {
        for (int k = i; k < arr.length; k++) {
            if (arr[k][j]==1) {
                count2++;
            } else {
            bad=true;
            break;
            }
            
        }
        }
        catch (Exception e){
        }
        //System.out.println("count 2 "+count2);
        if (count==count2 && bad==false) {
            //System.out.println("i "+i);
            //System.out.println("j "+j);
          //  System.out.println("oh wow");
            return true;
        }
        return false;
    
    }
    public static void display(int[][] arr){
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                System.out.print(arr[i][j]);
                
            }
            System.out.println();
        }
    }
}
