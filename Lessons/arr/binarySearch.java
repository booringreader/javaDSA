// array must be sorted to perform binary search on it; sorting can be increasing or decreasing
// for ascending order input.
// TC : O(logn)
// looping condition : start <= end
// conditions: equality, less than, greater than

import java.util.*; 
public class binarySearch{
    public static int bin_Search(int arr[], int key){
        int begin = 0, end = arr.length-1;

        while(begin <= end){
            int mid = (begin + end)/2;
            if(key == arr[mid]){
                return mid;
            }else if(key < arr[mid]){
                end = mid - 1;
            }else if(key > arr[mid]){
                begin = mid + 1;
            }
            System.out.println("mid: " + mid);
        }
        return -1;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[8];

        for(int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println();
        System.out.println(bin_Search(arr, 33));
    }
}
