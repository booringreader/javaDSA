public class mergesort {
    public static void printArr(int[] arr){
        for(int i = 0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
    public static void mergeSort(int arr[], int si, int ei){
        if(si>=ei){
            return;
        }
        int mid = si + (ei-si)/2;  // find middle
        mergeSort(arr, 0, mid); // mergeSort (left) ; differentiate between left and right using indices
        mergeSort(arr, (mid+1), ei);  //mergeSort(right)
        merge(arr, si, mid, ei);  //merge both
    }

    public static void merge(int[] arr, int si, int mid, int ei){
        int[] temp = new int[ei-si+1];
        int i = si;
        int j = (mid+1);
        int k = 0;

        while(i <= mid && j <= ei){     // while there are elements in the left and right array, execute the followign code
            if(arr[i] > arr[j]){        // if the element in the right array is smaller, push it into the temp array
                temp[k] = arr[j];       // else push the element of the other side of the array.
                j++;
            }else{
                temp[k] = arr[i];
                i++;
            }
            k++;
        }

        while(i <= mid){ // incase one of the two arrays is finished and there are elements left in the other one, this codeblock will add the rest of them.
            temp[k++] = arr[i++];
        }
        while(j <= ei){
            temp[k++] = arr[j++];
        }

        // give back temp elements to the arr
        for(k=0, i=si; k<temp.length; i++, k++){
            arr[i] = temp[k];
        }
    }
    public static void main(String args[]){
        int arr[] = {6, 3, 9, 5, 2, 8};
        mergeSort(arr, 0, arr.length-1);
        printArr(arr);
    }
}
