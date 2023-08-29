import java.util.*;
public class rainwater{
    public static void trap(int arr[], int breadth){
        int left_Max[] = new int[arr.length];
        int right_Max[] = new int[arr.length];
        int sum = 0;

        left_Max[0] = arr[0];
        right_Max[0] = arr[arr.length-1];

        for(int i = 1; i < arr.length; i++){
            left_Max[i] = Math.max(arr[i], left_Max[i-1]);
        }
        for(int i = 1; i < arr.length; i++){
            right_Max[i] = Math.max(arr[arr.length-i-1], right_Max[i-1]);
        }
        for(int i = 0; i < arr.length; i++){
            int water_level = Math.min(left_Max[i], right_Max[i]);
            sum += (water_level - arr[i]) * breadth;
            if(sum < 0){
                sum = 0;
            }
        }

        System.out.println("water contained inside: " + sum);
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[7];

        for(int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }

        System.out.println("breadth of each tower: ");
        int breadth = sc.nextInt();

        trap(arr, breadth);
    }
}