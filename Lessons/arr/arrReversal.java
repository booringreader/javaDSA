// brute force : new array, begin from the end and store elements
// TC: O(n), SC: O(n)
//
// inplace reversal: swap element at index i from the beginning and i from the end
// TC: O(n), SC: O(1)

import java.util.*;
public class arrReversal {
    public static void rev(int arr[]){
        int n = arr.length;

        for(int i = 0; i < n/2; i++){
           int temp = arr[i];
            arr[i] = arr[n-i-1];
            arr[n-i-1] = temp;
    }
    //in this if i goes all the way to the end then the array gets reversed twice.
}
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[7];

        for(int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }

        rev(arr);
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
}

// import java.util.*;
// public class arrReversal{
//     public static void reversal(int numbers[]){
//         int first = 0, last = numbers.length - 1;

//         while(first < last){
//             int temp = numbers[first]; 
//             numbers[first] = numbers[last];
//             numbers[last] = temp;
//             first++;
//             last--;
//         }
//     }
//     public static void main(String args[]){
//         int arr[] = new int[7];
//         Scanner sc = new Scanner(System.in);

//         for(int i = 0; i < arr.length; i++){
//             arr[i] = sc.nextInt();
//         }

//         reversal(arr);

//         for(int i = 0; i < arr.length; i++){
//             System.out.print(arr[i]);
//         }
//     }
// }
