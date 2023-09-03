//reducing time complexity for best case
import java.util.*;
public class bubble {
    public static void bubbles(int arr[]){
        int counter = 0, swap =0;
        int n = arr.length;
        while(counter < n){
            for(int i = 0; i < arr.length-1; i++){
                int temp;
                if(arr[i] > arr[i+1]){
                    temp = arr[i+1];
                    System.out.println("temp: " + temp);
                    arr[i+1] = arr[i];
                    arr[i] = temp;
                    swap++;
                }
                if(swap < 1)
                    break;
            }
            counter++;
        }
        for(int i = 0; i <arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }    
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int input[] = new int[5];

        for(int i = 0; i < input.length; i++){
            input[i] = sc.nextInt();
        }

        bubbles(input);
    }
}










// import java.util.*;
// public class bubble {
//     public static void bubbles(int arr[]){
//         int counter = 0;
//         int n = arr.length;
//         while(counter < n){
//             for(int i = 0; i < arr.length-1; i++){
//                 int temp;
//                 if(arr[i] > arr[i+1]){
//                     temp = arr[i+1];
//                     System.out.println("temp: " + temp);
//                     arr[i+1] = arr[i];
//                     arr[i] = temp;
//                 }
//             }
//             counter++;
//         }
//         for(int i = 0; i <arr.length; i++){
//             System.out.print(arr[i] + " ");
//         }
//     }    
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);
//         int input[] = new int[5];

//         for(int i = 0; i < input.length; i++){
//             input[i] = sc.nextInt();
//         }

//         bubbles(input);
//     }
// }
