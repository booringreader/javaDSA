// given two arrays A and B of equal length n. pair each element of array A to an element in array B, 
// such that sum S of absoulte differences of all the pairs is minimum

// min absolute difference can be 0
// greedy objective: pair up numbers which are closest to each other and calculate differnce in them
package Lessons.greedy;

import java.util.Arrays;

public class minDiff {
    public static void main(String args[]){
        int A[] = {3,2,3};
        int B[] = {2,1,3};

        Arrays.sort(A);
        Arrays.sort(B);

        int minDiff=0;
        for(int i=0; i<A.length; i++){
            minDiff += Math.abs(A[i] - B[i]);
        }

        System.out.println(minDiff);
    }
}
