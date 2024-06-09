package dp;

import java.util.Arrays;
public class countWays {
    public static int countways(int ways[], int n){
        if(n==0){
            return 1;
        }else if(n<0){
            return 0;
        }

        if(ways[n] != -1){
            return ways[n];
        }
        ways[n] = countways(ways, n-1) + countways(ways, n-2);
        return ways[n];
    }
    public static void main(String[] args){
        int n=5;
        int ways[] = new int[n+1];
        Arrays.fill(ways, -1);
        System.out.println(countways(ways, n));
    }
}
