package saddlepoint;

/**
 *
 * @author dell
 */
public class Saddlepoint {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[][] array={
            {7,30,40},
            {45,78,45},
            {1,2,3}
        };
        display(array);
        
        int[] smolrow=new int[3];
        int[] bigcol=new int[3];
        for (int i = 0; i < array.length; i++) {
                int min=Math.min(array[i][0],array[i][1]);
                min=Math.min(array[i][2],min);
                smolrow[i]=min;
        }
        for (int i = 0; i < bigcol.length; i++) {
            int j = bigcol[i];
                int max=Math.max(array[0][i],array[1][i]);
                max=Math.max(array[2][i],max);
                bigcol[i]=max;
        }
        
        for (int i = 0; i < bigcol.length; i++) {
            
        }
        System.out.println();
        for (int i = 0; i < bigcol.length; i++) {
            
        }
        System.out.println();
        for (int i = 0; i < smolrow.length; i++) {
            for (int j = 0; j < bigcol.length; j++) {
                if (smolrow[i]==bigcol[j]){
                    System.out.println("The saddle point is "+smolrow[i]+" and it's position is row "+(i+1)+" and col "+(j+1));
                }
            }
            
        }
        
    }
    public static void display(int[][] arr){
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println("");
        }
    }
}
