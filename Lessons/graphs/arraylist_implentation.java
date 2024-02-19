package Lessons.graphs;

import java.util.ArrayList;

public class arraylist_implentation {
    static class edge{
        int src, dest, wt;

        edge(int s, int d, int w){
            src = s; dest = d; wt = w;
        }


    }
    public static void main(String args[]){
        /*
        
                  (5)
                0 ----  1
                      / |
                 (3) /  | (1)
                    /   |  
                   3 -- 2 --- 4
                    (1)   (2)
                    
        */ 
        int V = 5; // number of vertices in the graph
        /*
         * arraylist is built on top of array structure
         * the following block of code declares an array (named graph) of arraylists (dynamic arrays) that will hold object of type 'edge'
         * number of elements in the array is V 
         * each element of graph array is referenced to a vertex
         
         * graph
            |
            +--> [ArrayList<edge>]   [ArrayList<edge>]   [ArrayList<edge>]   ...   [ArrayList<edge>]
            |           |                   |                   |                  |
            +-->      graph[0]             graph[1]             graph[2]         graph[V-1]
                        |                   |                   |                   
                        +--> (ArrayList for edges incident on vertex 0) each element of arraylist stores parameters defined in 'edge' class
                        +--> (ArrayList for edges incident on vertex 1)
                        +--> (ArrayList for edges incident on vertex 2)
                        +--> ...
                        +--> (ArrayList for edges incident on vertex V-1)

         */
        ArrayList<edge>[] graph = new ArrayList[V]; // null -> empty arraylist

        for(int i = 0; i<V; i++){
            graph[i] = new ArrayList<>();
        }

        graph[0].add(new edge(0,1,5)); // each index of arraylist holds reference to the object of class edge
        graph[1].add(new edge(1,0,5)); // add function adds a reference to the object of class edge at the end of the arraylist
        graph[1].add(new edge(1,3,3));
        graph[1].add(new edge(1,2, 1));

        // neighbors of a index

        for(int i = 0; i < graph[1].size(); i++){
            edge e = graph[1].get(i); // graph[1] gives all the arraylists of the vertex 1 and get() gives all the data stored in the arraylist (reference ot the object incase a reference is stored in the list)
            System.out.println("src: " + e.src + " dest: " + e.dest + " wt: " + e.wt);
        }
        
    }
}
