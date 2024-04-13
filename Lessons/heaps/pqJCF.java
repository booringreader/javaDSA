package Lessons.heaps;

import java.util.Comparator;
import java.util.PriorityQueue;

public class pqJCF {
    public static void main(String args[]){
        PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder()); // for descending order

        pq.add(45); pq.add(291); pq.add(57); 

        while(!pq.isEmpty()){
            System.out.println(pq.peek());
            pq.remove();
        }
    }
}
