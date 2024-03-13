//Given an infinite supply of denominations [1,2,5,10,20,50,100,500,2000].
// Find the minimum number of coins/notes to make change for a value V.

package Lessons.greedy;
import java.util.*;

public class coins {
    public static void main(String args[]){
        int coins[] = {1,2,5,10,20,50,100,500,2000};
        int V = 590, count=0, i=coins.length-1;
        ArrayList<Integer> name = new ArrayList<>();
        
        while(!(V==0)){
            if(coins[i] <= V){
                count++;
                V -= coins[i];
                name.add(coins[i]);
                i = coins.length-1;
            }
            i--;
        }

        System.out.println("count: " + count);
        System.out.println("coins: ");
        
        for(int j=0; j<name.size(); j++){
            System.out.println(name.get(j)+" ");
        }
    }    
}
