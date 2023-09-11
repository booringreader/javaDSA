import java.util.*;
public class matrix {
    public static void main(String args[]){
        int matrix[][] = new int[3][3];
        Scanner sc = new Scanner(System.in);
        int m = matrix.length, n = matrix[0].length;

        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                matrix[i][j] = sc.nextInt();
            }
        }
        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                System.out.print(matrix[i][j]);
            }
            System.out.println();
        }
    }
}
