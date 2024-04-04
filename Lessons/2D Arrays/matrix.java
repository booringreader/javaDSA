/*
 * create a 2D matrix from user defined input
*/

import java.util.*;
public class matrix {
    public static void main(String args[]){
        int matrix[][] = new int[3][5]; // declares a 2D array
        Scanner sc = new Scanner(System.in); // class to take user input
        int m = matrix.length, n = matrix[0].length; // matrix.length returns number of rows; matrix[0].length returns number of columns
        
        for(int i = 0; i < m; i++){ // takes input of 2D array from user
            for(int j = 0; j < n; j++){
                matrix[i][j] = sc.nextInt();
            }
        }

        for(int i = 0; i < m; i++){ // prints 2D array as a matrix
            for(int j = 0; j < n; j++){
                System.out.print(matrix[i][j]);
            }
            System.out.println();
        } 
    }
}
