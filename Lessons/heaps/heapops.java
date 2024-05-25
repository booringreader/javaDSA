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

public class heapops {
    static class Heap{
        ArrayList<Integer> arr = new ArrayList<>();

        public boolean isEmpty(){
            return arr.size()==0;
        }
        
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

        // heapify function
        // the objective is to make minIdx element the root
        private void heapify(int i){ // takes the index of the node as input which is to be balanced, in this case will be the global root
            int left = 2*i + 1;  // left child of parent 'i'
            int right = 2*i + 2;

            // we take the minimum index which, in case of minHeap is the global root node
            int minIdx = i;

            // the following conditional blocks check if the replaced global root destroys the balance of the tree
            if(left < arr.size()-1 && arr.get(left) < arr.get(minIdx)){
                minIdx = left;
            }
            if(right < arr.size()-1 && arr.get(right) < arr.get(minIdx)){
                minIdx = right;
            }
            
            // if the balance of the tree is preserved do nothing, if not do the following
            if(minIdx != i){
                //swap
                int temp = arr.get(i);
                arr.set(i, arr.get(minIdx));
                arr.set(minIdx, temp);

                heapify(minIdx);
                
            }
        }
        public int remove(){
            int data = arr.get(0);

            // step1 - swap first and last index elements i.e. root and leaf
            int temp = arr.get(arr.size()-1);
            arr.set(arr.size()-1, data);
            arr.set(0, temp);

            // step2 - remove the end node i.e the root
            arr.remove(arr.size()-1);

            // now the global root is the element which was previously at the end of the arraylist i.e the rightmost leaf node of the binary tree
            // step3 - use heapify to balance the binary tree
            heapify(0);

            return data;
        }
    }  
    public static void main(String args[]){
        Heap h = new Heap();
        h.add(3); h.add(4); h.add(1); h.add(5);

        while(!h.isEmpty()){
            System.out.println(h.peek());
            h.remove();
        }
    }
}
