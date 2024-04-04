/*
 *       1  2  3  4
 *       5  6  7  8
 *       9 10 11 12
 *      13 14 15 16
 *      
 *      find sum of elements present at the diagonals of the above matrix : {1, 6, 11, 16, 4, 7, 10, 13} 
*/

import java.util.*;
public class diagonalSUM {
    //O(n )
    public static void diag(int arr[][]){
        int sum = 0;
        for(int i = 0; i < arr.length; i++){
            sum += arr[i][i]; // adds elements present on the primary diagonal {1,6,11,16}
            if(i != arr.length-1-i){
                // elements on the secondary diagonal have index : (size-1)-i ; i.e declining by 1 on each iteration of increment in 'i', beginning with (size-1) 
                sum += arr[i][arr.length-1-i];  // adds elements present on the secondary diagonal {4,7,10,13}
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

        for(int i = 0; i < input.length; i++){ // takes array input
            for(int j = 0; j < input.length; j++){
                input[i][j] = sc.nextInt();
            }
        }
        diag(input);
    }
}
