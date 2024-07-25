// array of numbers is given and we need to find the largest element in it.
// traverse through the array (in linear time), store the largest element found

import java.util.*;
public class largest {
    public static void large(int arr[]){
        int temp = Integer.MIN_VALUE; //arr[0]; 
                                      //
        for(int i = 0; i < arr.length; i++){
            if(arr[i] > temp){
                temp = arr[i];
            }
        }
        System.out.println("largest term in the array: " + temp);
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int input[] = new int[8];
        for(int i = 0; i < input.length; i++){
            input[i] = sc.nextInt();
        }

        large(input);
    }
}
