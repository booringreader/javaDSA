import java.util.PriorityQueue;

public class weakestSoldier {

    static class Row implements Comparable<Row>{
        int soldier, idx;

        public Row(int soldiers, int index){
            this.soldier = soldiers;
            this.idx = index;
        }

        @Override 
        public int compareTo(Row r2){
            if(this.soldier == r2.soldier){
                return this.idx - r2.idx; // if soldier count equal then compare based on index
            }else{
                return this.soldier - r2.soldier; // otherwise compare based on soldier count
            }
        }
    }
    public static void main(String args[]){
        int army[][] = {{1,0,0,0},
                        {1,1,1,1},
                        {1,0,0,0},
                        {1,0,0,0}};
        int k=2;

        PriorityQueue<Row> pq = new PriorityQueue<>();

        for(int i=0; i<army.length; i++){
            int count = 0;
            for(int j=0; j<army[0].length; j++){
                count += army[i][j] == 1 ? 1 : 0; // if index has 1 then store 1 in pq else 0
            }
            pq.add(new Row(count, i));
        }

        for(int i=0; i<k; i++){
            System.out.println(pq.remove().idx); // pq sorts in ascending order and we need index of it
        }
    }
}
