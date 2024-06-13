package dp;

public class targetSum {

    public static boolean targetSubset(int arr[], int sum){
        boolean dp[][] = new boolean[arr.length+1][sum+1];
        for(int i=0; i<arr.length+1; i++){
            dp[i][0] = true;
        }

        // tabulation code
        for(int i=1; i<arr.length+1; i++){
            for(int j=1; j<sum+1; j++){
                int v = arr[i-1];
                // include the 'ith' item
                if(v <= j && dp[i-1][j-v]== true){
                    dp[i][j] = true;
                }
                // exclude
                else if(dp[i-1][j]==true){
                    dp[i][j] = true;
                }
            }
        }

        return dp[arr.length][sum];
    }
   public static void main(String[] args){
    int sum = 20;
    int numbers[] = {4, 2, 7, 1, 3};
    System.out.println(targetSubset(numbers, sum));
   } 
}
