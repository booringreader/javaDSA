package Lessons.heaps;

import java.util.Comparator;
import java.util.PriorityQueue;

public class pqJCF {
    static class student implements Comparable<student> { // overriding
        String name; int rank;
        public student(String name, int rank){
            this.name = name;
            this.rank = rank;
        }

        @Override
        public int compareTo(student s2){
            return this.rank - s2.rank;
        }
    }
    public static void main(String args[]){
        PriorityQueue<student> pq = new PriorityQueue<>(); // for descending order

        pq.add(new student("A", 10)); 
        pq.add(new student("B", 11)); 
        pq.add(new student("C", 13)); 

        while(!pq.isEmpty()){
            System.out.println(pq.peek().name +" -> " + pq.peek().rank);
            pq.remove();
        }
    }
}
