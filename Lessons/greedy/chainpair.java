// You are given n pairs of numbers. In every pair, the first number is always smaller than the second number. A pari (c, d) can come after pari (a,b) if b <c
// Find the longest chain which can be formed from a given set of paris.

package Lessons.greedy;

import java.util.Comparator;
import java.util.Arrays;

public class chainpair {
    public static void main(String args[]){
        int pairs[][] = {{5,24}, {39,60}, {5,28}, {27,40}, {50,90}};
        int sortpairs[][] = new int[pairs.length][3];

        for(int i=0; i<pairs.length; i++){
            sortpairs[i][0] = i;
            sortpairs[i][1] = pairs[i][0];
            sortpairs[i][2] = pairs[i][1];
        }
        // sorting the new array based on second column
        Arrays.sort(sortpairs, Comparator.comparingDouble(o -> o[2]));

        int chainlength = 1;
        int Lastlarge = sortpairs[0][2];
        for(int i=0; i<pairs.length; i++){
            if(sortpairs[i][1] > Lastlarge){
                chainlength++;
                Lastlarge = sortpairs[i][2];
            }
        }

        System.out.println("length: " + chainlength);
    }

}
