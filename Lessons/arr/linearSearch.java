/*
 * searching through all the elements of an array one at a time - linear search 
 * TC : O(n)
*/ 

import java.util.Scanner;
public class linearSearch {
    public static void main(String args[]){
        int SIZE, key;
        Scanner sc = new Scanner(System.in);
        SIZE = sc.nextInt();

        int[] arr= new int[SIZE];
       
        for(int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }

        System.out.print("key: ");
        key = sc.nextInt();

        for(int i = 0; i < arr.length; i++){
            if(arr[i] == key){
                System.out.println(i);
            }
        }
    }
}
