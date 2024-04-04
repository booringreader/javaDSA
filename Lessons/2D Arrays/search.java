/*
 * search in a sorted 2D matrix (sorted vertically & horizontally)
 *
 *      10 20 30 40
 *      15 25 35 45
 *      27 29 37 48
 *      32 33 39 50
*/

import java.util.*;
public class search {
    public static void sea(int key, int arr[][]){
        // begin from one of the corners
        // in the below code, we begin from the top rigth corner
        // check until we reach the element on the opposite (bottom left) column or until the element is found
        int i = 0, j = arr.length-1; // 'i' tracks rows; 'j' tracks columns

        while(i < arr.length && j >= 0){
            if(key == arr[i][j]){ // element is found
                System.out.println("found");
                break;
            }
            // element is less than the current one, we can either go up or left 
            // since we are starting from top right, we should go left (to incorporate corner cases)
            else if(key < arr[i][j]){ 
                j--;
            }else if(key > arr[i][j]){
                i++;
            }else {
                System.out.println("no key");
            }
        }
    }



    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int input[][] = new int[4][4];

        for(int i = 0; i < input.length; i++){
            for(int j = 0; j < input.length; j++){
                input[i][j] = sc.nextInt();
            }
        }
        System.out.print("key: " + " ");
        int key = sc.nextInt();
        sea(key, input);
    }
}
