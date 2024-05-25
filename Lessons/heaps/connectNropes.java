// given N ropes, combine them in minimum cost (cost = sum of lengths of ropes)
// not greedy approach, since in greedy approach the array will be statically sorted
// in PQ approach the array will be dynamically sorted, i.e. it will sort itself after each addition
// so that in case the addition product(new rope) is longer than the existing ropes, then the shorter ropes get combined first

import java.util.PriorityQueue;

public class connectNropes {
    public static void main(String args[]){
        int arr[] = {2,3,3,4,6};

        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(int i=0; i<arr.length; i++){
            pq.add(arr[i]);
        }

        int sum =0;
        while(pq.size()>1){
            int min = pq.remove();
            int min2 = pq.remove();
            sum += min+min2;

            pq.add(min+min2);
        }

        System.out.println(sum);
    }
}
