import java.util.*;
public class diagonalSUM {
    //O(n )
    public static void diag(int arr[][]){
        int sum = 0;
        for(int i = 0; i < arr.length; i++){
            //primary diagonal
            sum += arr[i][i];
            //secondary diagonal
            if(i != arr.length-1-i){
                sum += arr[i][arr.length-1-i];
            }
        }
        System.out.println(sum);
    }
    //brute force
    // public static void diag(int arr[][]){
    //     int sum = 0;
        
    //     for(int i = 0; i < arr.length; i++){
    //         for(int j = 0; j < arr.length; j++){
    //             if(i == j){
    //                 sum += arr[i][j];
    //             }else if( i + j == (arr.length-1)){
    //                 sum += arr[i][j];
    //             }
    //         }
    //     }
    //     System.out.println(sum);
    // }    
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int input[][] = new int[4][4];

        for(int i = 0; i < input.length; i++){
            for(int j = 0; j < input.length; j++){
                input[i][j] = sc.nextInt();
            }
        }
        diag(input);
    }
}
