// you are given n acitivities wiht their start & end times. Select the maximum number of activities that can be performed by a signle person, assuming that a  
// person can only work on a single activity at a time. 
// activities are sorted according to end time

// greedy approach: the end time of activities starting earlier should be less than the start time of activities starting later

package Lessons.greedy;

import java.util.Comparator;
import java.util.Arrays;
import java.util.ArrayList;

public class actSelection {
    static void select(int[] start, int[] end){
        // count var to keep track of the number of activites and order arraylist to keep track of 
        // id of the specifi activity
        int count=1; // first activity will always be done
        ArrayList<Integer> order = new ArrayList<>();

        // in case where the input array is not sorted according to end time, we have to sort it.
        int sort[][] = new int[start.length][3];
        for(int i=0; i<sort.length; i++){
            // assuming the end time for all the start times is well defined
            sort[i][0] = i;
            sort[i][1] = start[i];
            sort[i][2] = end[i];
        }
        // now to sort the end time column (using java comparator); lambda function
        Arrays.sort(sort, Comparator.comparingDouble(o -> o[2]));
    
        order.add(sort[0][0]); // first activity will always be done
        int firstEnd = sort[0][2]; // end time of first activity;
        for(int i=1; i<start.length; i++){
            if(sort[i][1] >= firstEnd){
                count++;
                order.add(sort[i][0]);
                firstEnd = sort[i][2];
            }
        }
        System.out.println("num of activities: " + count);
        for(int i=0; i<order.size(); i++){
            System.out.println("A" + order.get(i) + " ");
        }
    }
    public static void main(String args[]){
        int start[] = {10,12,20};
        int end[] = {20,25,30};
        select(start, end);
    }
}
