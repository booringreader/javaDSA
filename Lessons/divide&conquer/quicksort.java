public class quicksort {
    public static void printArr(int[] arr){
        for(int i = 0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
    public static void quickSort(int arr[], int si, int ei){
        //base case
        if(si>=ei){
            return;
        }
        //find pivot - last element
        //implement the logic of partition : use a separate method to keep things clear
        int pindex = partition(arr, si, ei);

        //use recursion on successive array (figuratively speaking)
        quickSort(arr, si, pindex-1);
        quickSort(arr, (pindex+1), ei);
    }
    public static int partition(int arr[], int si, int ei){
        int i = si-1, pivot = arr[ei];

        for(int j = si; j<ei; j++){
            if(arr[j] <= pivot){
                i++;
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
            }
        }
        i++;
        int temp = pivot;
        arr[ei] = arr[i]; 
        //pivot is a variable and changes to variable are not reflected in the array index
        // pivot = arr[i];
        arr[i] = temp;
        return i;
    }

    public static void main(String args[]){
        int arr[] = {6, 3, 9, 8, 2, 5};
        quickSort(arr, 0, arr.length-1);
        printArr(arr);
    }
}
