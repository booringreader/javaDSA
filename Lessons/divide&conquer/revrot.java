public class revrot{
    public static int modbin(int arr[], int key, int si, int ei){
        if(si > ei){ 
            return -1;
        }
        int mid = si + (ei-si)/2;
        //ideal case when mid is the same as target
        if(arr[mid] == key){
            return mid;
        }

        //when mid is on L1 ; given pre-rotation array was an ascending one
        if(arr[si] <= arr[mid]){
            if(arr[si] <= key && key <= arr[ei]){
                return modbin(arr, key, si, mid-1);
            }else{
                return modbin(arr, key, mid+1, ei);
            }
        }

        //when mid is on L2; the element at si index will be larger than the mid one
        else{
            if(arr[mid] <= key && key <= arr[ei]){
                return modbin(arr, key, mid+1, ei);
            }else{
                return modbin(arr, key, si, mid-1);
            }
        }
    }
    public static void main(String args[]){
        int arr[] = {4, 5, 6, 7, 0, 1, 2};
        int key = 0; //output: 4
        System.out.println(modbin(arr, key, 0, arr.length-1));
    }
}