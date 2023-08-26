import java.util.*;
public class maxSubarraySum{
    public static void brute_Force(int arr[]){
        int max_sum = Integer.MIN_VALUE;
        int current_sum = 0;

        for(int i = 0; i < arr.length; i++){
            for(int j = i; j < arr.length; j++){
                for(int k = i; k < j; k++){
                    current_sum += arr[k];
                }
                if(current_sum > max_sum){
                    max_sum = current_sum;
                } // max sum needs to be recorded after each sub-array and each value of j creates a sub-array (the k loop), so we can place the if conditional outside the k loop and it will work the same way.
                current_sum = 0;
            }
        }
        System.out.println("maximum sum: " + max_sum);
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[8];

        for(int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }

        brute_Force(arr);
    }
}





// import java.util.*;
// public class maxSubarraySum {
//     public static void brute_Force(int arr[]){
//         int temp = Integer.MIN_VALUE;
//         int sum;

//         for(int i = 0; i < arr.length; i++){
//             sum = arr[i];
//             for(int j = i; j < arr.length; j++){
//                 for(int k = i; k <= j; k++){
//                     sum += arr[k];
//                 }
//                 if(sum > temp){
//                         temp = sum;
//                     }else 
//                     continue;
//             }
//             System.out.println("sum" + (i+1) + ": " + temp);
//         }
//     }
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);
//         int arr[] = new int[8];

//         for(int i = 0; i < arr.length; i++){
//             arr[i] = sc.nextInt();
//         }
        
//         brute_Force(arr);
//     }
// }
