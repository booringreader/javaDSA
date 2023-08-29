import java.util.*;
public class prefixSum {
    public static void pref(int arr[]){
        int sub_maxSum = 0;
        int max_sum = Integer.MIN_VALUE;
        int prefix[] = new int[arr.length];
        prefix[0] = arr[0];

        //calculating prefix sum array;
        for(int i = 1; i < prefix.length; i++){
            prefix[i] = prefix[i-1] + arr[i];
        }

        for(int i = 0; i < arr.length; i++){
            for(int j = i; j < arr.length; j++){
                sub_maxSum = i == 0 ? prefix[j] : prefix[j] - prefix[i-1];
                if(sub_maxSum > max_sum){
                    max_sum = sub_maxSum;
                }
            }
        }
        System.out.println("max sum: " + max_sum);
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int numbers[] = new int[5];

        for(int i = 0; i < numbers.length; i++){
            numbers[i] = sc.nextInt();
        }

        pref(numbers);
    }
}
