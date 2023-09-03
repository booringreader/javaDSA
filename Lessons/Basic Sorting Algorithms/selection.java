import java.util.*;
public class selection {
    public static void select(int arr[]){
        for(int i = 0; i <arr.length-1; i++){
            int current = i; // this way the number being used for reference will always be the first one in the unsorted sub-array.
            for(int j = (i+1); j < arr.length; j++){
                if(arr[current] > arr[j]){
                    current = j;
                }
            }
            int temp = arr[current];
            arr[current] = arr[i];
            arr[i] = temp;
        }
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
    // public static void select(int arr[]){
    //     int current = Integer.MAX_VALUE;

    //     for(int i = 0; i < arr.length-1; i++){
    //         int smallest = i;
    //         for(int j = 0; j < arr.length; j++){
    //             if(current > arr[j]){
    //             current = arr[j];
    //             }
    //         }
    //         int intern = current;
    //         current = arr[i];
    //         arr[i] = intern;
    //     }
    //     for(int i = 0; i < arr.length; i++){
    //         System.out.print(arr[i] + " ");
    //     }
    // }    
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int input[] = new int[5];

        for(int i = 0; i <input.length; i++){
            input[i] = sc.nextInt();
        }
        select(input);
    }
}
