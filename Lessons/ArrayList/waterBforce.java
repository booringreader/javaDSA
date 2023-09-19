import java.util.*;
public class waterBforce {
    public static void contain(int arr[]){
        int water, mostWater = Integer.MIN_VALUE;

        for(int i = 0; i < arr.length; i++){
            for(int j = (i+1); j < arr.length; j++){
                water = (j-i)* Math.min(arr[i], arr[j]);
                mostWater = Math.max(water, mostWater);
            }
        }
        System.out.println("most water: " + mostWater);
    }
    public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int input[] = new int[9];
    
    for(int i = 0; i < input.length; i++){
        input[i] = sc.nextInt();
    }

    contain(input);
    }
}
