// heap is being implemented as an arraylist
// when a new element is inserted, it means that the element goes to the end of the arraylist i.e
// minHeap : smaller to bigger
// maxHeap : bigger to smaller

/*
 *              2
 *             / \
 *            3  4         heap before insertion
 *           / \
 *          5  10
 *       
 *           ⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯
 *          | 2 | 3 | 4 | 5 | 10 |       : minheap before insertion
 *           ⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯
 *           
 *           ⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯
 *          | 2 | 3 | 4 | 5 | 10 | 1 |   : minheap after insertion
 *           ⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯
 */
// new heap is not complete binary tree, it needs to be balanced
// for balancing we swap the current element with local root if it is smaller than the local root

package Lessons.heaps;
import java.util.ArrayList;

public class insertheap {
    static class heap{
        ArrayList<Integer> arr = new ArrayList<>();

        public void add(int data){
            arr.add(data); // add new element at the last index of the arraylist

            // balancing of new tree begins

            int idx  = arr.size()-1; // index of current node (new element inserted at the end of arraylist)
            int parent = (idx-1)/2; // index of local root (parent)
            
            while(arr.get(idx) < arr.get(parent)){ // while element at idx is less than the local root or the parent keep swapping
                int temp = arr.get(idx);
                arr.set(idx, arr.get(parent)); 
                arr.set(parent, temp);
            }
        }

        public int peek(){
            return arr.get(0);
        }
    }  
    public static void main(String args[]){
        
    }
}
