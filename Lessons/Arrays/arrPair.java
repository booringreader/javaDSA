import java.util.*;
public class arrPair {
    public static void pair(int arr[]){
        for(int i = 0; i < arr.length; i++){
            for(int j = (i+1); j < arr.length; j++){
                System.out.print("(" + arr[i] + ", " + arr[j] + ")");
            }
            System.out.println();
        }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[8];

        for(int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }

        pair(arr);
    }
}
