import java.util.*;
public class subarray {
    // public static void sub(int arr[]){
    //     for(int i = 0; i < arr.length; i++){
    //         System.out.print("(" + arr[i] + ") ");
    //         for(int j = (i+1); j < arr.length; j++){
    //             System.out.print("(" + arr[i] + "," + arr[j] + ")");
    //         }
    //         System.out.println();
    //     }
    // }

    public static void subs(int arr[]){
        int begin = 0, end = arr.length;

        for(int i = 0; i < end; i++){
            for(int j = (begin+1); j <= end; j++){
                System.out.print("(");
                for(int k = i; k < j; k++){
                    System.out.print(arr[k] + " ");
                }
                System.out.print(")");
            }

            begin++;
            System.out.println();
        }
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[8];
        
        for(int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }
        subs(arr);
    }
}
