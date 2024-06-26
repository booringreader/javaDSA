// given 2D coordinates of N cars (from origin)
// find the nearest K cars from the origin

// approach - find the (distance)^2 of each car and arrange them in a priority queue

import java.util.PriorityQueue;

public class nearbycars {
    static class Point implements Comparable<Point>{
        int x, y, distsqr, idx;
        public Point(int x, int y, int distsqr, int idx){
            this.x = x;
            this.y = y;
            this.distsqr = distsqr;
            this.idx = idx;
        }

        @Override
        public int compareTo(Point p2){
            return this.distsqr - p2.distsqr; // ascending order
        }
    }

    public static void main(String args[]){
        int pts[][] = {{3,3}, {5,-1}, {-2,4}};
        int k=2;

        PriorityQueue<Point> pq = new PriorityQueue<>();

        for(int i=0; i<pts.length; i++){
            int distsqr = pts[i][0]*pts[i][0]+pts[i][1]*pts[i][1];
            pq.add(new Point(pts[i][0],pts[i][1], distsqr, i));
        }


        for(int i=0; i<k; i++){
            System.out.println("C"+ pq.remove().idx);
        }
    }
}
