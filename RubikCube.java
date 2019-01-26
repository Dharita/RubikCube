//import for Scanner
import java.util.Scanner;

public class RubikCube {
    public static void main(String args[] ) throws Exception {
        String rowToRotate = null, columnToRotate = null;
        Scanner s = new Scanner(System.in);
        // Reading input from STDIN
        String nrc = s.nextLine();                 
        int size = Integer.parseInt(nrc.split(" ")[0]);
        int row = Integer.parseInt(nrc.split(" ")[1]);
        int coulmn = Integer.parseInt(nrc.split(" ")[2]);
       
        int[][] matrix = new int[size][size];
        for(int i = 0; i<size; i++) {
            String rows = s.nextLine();  
            for(int j = 0; j < rows.split(" ").length; j++) {
                matrix[i][j] = Integer.parseInt(rows.split(" ")[j]);
            }
        }
        
        if(row > 0)
            rowToRotate = s.nextLine();  

        if(coulmn > 0)
            columnToRotate = s.nextLine();  

        // row rotation
        if(rowToRotate != null) {  
            for(int k = 0; k<rowToRotate.split(" ").length; k++) {
                int rowRotate = Integer.parseInt(rowToRotate.split(" ")[k]);
                int temp = matrix[rowRotate-1][size-1];
                for(int i = size-1; i>0; i--) {
                  matrix[rowRotate-1][i] =   matrix[rowRotate-1][i-1];
                }
                matrix[rowRotate-1][0] = temp;
            }
      }
        
        // column rotation
        if(columnToRotate != null) {
            for(int k = 0; k<columnToRotate.split(" ").length; k++) {
                int columnRotate = Integer.parseInt(columnToRotate.split(" ")[k]);
                int temp = matrix[size-1][columnRotate-1];
                for(int i = size-1; i>0; i--) {
                  matrix[i][columnRotate-1] =   matrix[i-1][columnRotate-1];
                }
                 matrix[0][columnRotate-1] = temp;
                }
        }
        
        //print resultant matrix
        System.out.println("Resultant Matrix");
        for(int i = 0; i<size; i++) {
            for(int j = 0; j < size; j++) {
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }
}

