import java.util.*;
public class spiral{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int spiral[][] = new int[4][4];
        int m = spiral.length, n = spiral[0].length;
        int Start_row = 0, End_row = (m-1), Start_column = 0, End_column = (n-1);

        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                spiral[i][j] = sc.nextInt();
            }
        }

        while(Start_row <= End_row && Start_column <= End_column){
            //top columns
            for(int i = Start_column; i <= End_column; i++){
                System.out.print(spiral[0][i] +  " ");
            }
            //right rows
            for(int i = (Start_row + 1); i <= End_row; i++){
                System.out.print(spiral[i][End_column] + " ");
            }
            //bottom columns
            for(int i = (End_column -1); i >= Start_column/*0 */; i--){
                 if(Start_row == End_row){
                    break;
                }
                System.out.print(spiral[End_row][i] + " ");
            }
            //left rows
            for(int i = (End_row - 1); i >= (Start_row + 1); i--){
                 if(Start_column == End_column){
                    break;
                }
                System.out.print(spiral[i][Start_column] + " ");
            }

            Start_row++; End_row--; Start_column++; End_column--;
        }
    }
}





// public class spiral {
//     public static void main(String args[]){
//         int spiral[][] = new int[4][4];
//         int m = spiral.length, n = spiral[0].length;

//         for(int i = 0; i < m; i++){
//             for(int j = 0; j < n; j++){

//             }
//         }


//     }
// }
