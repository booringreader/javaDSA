package Lessons.backtracking;

public class onArray {
    // to change the array values; input is (skeleton) array, index tracker, input value
    public static void change(int arr[], int i, int value){
        // base case
        if(i == arr.length){
            printarr(arr);
            return;
        }
        
        // recursion
        arr[i] = value;
        change(arr, (i+1), (value+1));
        arr[i] -= 2;
    }

    // to print array, just in case it becomes necessary
    public static void printarr(int arr[]){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    // main function to bring all the above functions together
    public static void main(String args[]){
        int arr[] = new int[5];
        change(arr, 0, 1);
        printarr(arr);
    }
}
