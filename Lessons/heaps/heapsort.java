// given an array - sort it
// step1 - build a maxHeap (if ascending sorting); build a minHeap (if descending sorting)

// assuming we are doing ascending order sorting (maxHeap)
// step2 - swap biggest element with the last element and call heapify on the first element
// the new last element has reached its desired location, it need not be included in the heap anymore
// size of the heap reduces by 1

// repeat swapping and heapifying until only one element is left in the heap

import javax.swing.plaf.synth.SynthStyle;

public class heapsort {
    public static void heapify(int arr[], int root, int size){
        int left = 2*root + 1; 
        int right = 2*root + 2;
        int maxIdx = root;

        if(left < size && arr[left] > arr[maxIdx]){
            maxIdx = left;
        }
        if(right < size && arr[right] > arr[maxIdx]){
            maxIdx = right;
        }

        if(maxIdx != root){
            // swap
            int temp = arr[root];
            arr[root] = arr[maxIdx];
            arr[maxIdx] = temp;


            heapify(arr, maxIdx, size);
        }
    }

    public static void heaps(int arr[]){
        // step 1
        int n = arr.length;
        for(int i=n/2; i>=0; i--){
            heapify(arr, i, n); // heap size 'n' is used in step2
        }

        // step2
        for(int i=n-1; i>0; i--){
            // swap
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;

            heapify(arr, 0, i);
        }
    }

    public static void main(String args[]){
        int arr[] = {1,2,4,5,3};
        heaps(arr);

        for(int i=0; i<arr.length; i++){
            System.err.print(arr[i] + " ");
        }
    }
}
