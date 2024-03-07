// given the weights and values of N items, put these items in a knapsack of quantity W to get the maximum total value in the knapsack

// greedy objective: weight should be less; value shoudl be high; the ratio weight/value should be high

package Lessons.greedy;
import java.util.Comparator;
import java.util.Arrays;

public class knapsack {
    static void div(int[] weight, int[] value, int W){
        int capacity = W; // space left in bag
        int finalV = 0; // track the value of goods inside the bag
        
        // in case the array is not sorted based on weight, we should do it first
        float ratio[][] = new float[weight.length][2]; // one for index, one for ratio 
        
        for(int i=0; i<ratio.length; i++){
            ratio[i][0] = i;
            ratio[i][1] = value[i]/(float)weight[i];
        }

        // now sort the ratios based on greedy objective
        Arrays.sort(ratio, Comparator.comparingDouble(o -> o[1])); // sorts in ascending order

        for(int i=ratio.length-1; i>=0; i--){
            int index = (int)ratio[i][0];
            if(weight[index] <= capacity){ // weight[i] chooses the element with maximum ratio since, i is going from bigger to smaller
                finalV += value[index];
                capacity -= weight[index];
            }else{
                finalV += (ratio[i][1] * capacity); // unitary method
                capacity = 0;
                break; // no need to be in the loop anymore
            }
        }
        System.out.println("value: " + finalV);
    }

    public static void main(String args[]){
        int weight[] = {10,20,30};
        int value[] = {60,100,120};
        int W = 50;
        div(weight, value, W);
    }
}
