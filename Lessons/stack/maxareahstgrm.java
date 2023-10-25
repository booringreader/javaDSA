import java.util.Stack;
public class maxareahstgrm {
    public static void area(int arr[]){
        int maxArea = 0;
        int nsr[] = new int[arr.length];
        int nsl[] = new int[arr.length];

        //next smaller right
        Stack<Integer> sr = new Stack<>();
        for(int i = arr.length-1; i >= 0; i--){
            /*
             * the while loop checks for the secondary for loop in brute force approach
             * i.e. since we are starting from the end of the original array, one of the elements 
             * becomes the anchor (1st for loop corresponding to the brute force) and the arr[sr.peek()] is the second element
             * that is being compared to the first.
             * this means, if I want the next smaller elements relative to the current element, I must remove all 
             * the elements greater than or equal to the current element (arr[i]).
             */
            while(!sr.isEmpty() && arr[sr.peek()] >= arr[i]){
                sr.pop();
            }

            /*
             * if in the process of removing the succeding elements [relative to the current element (arr[i])] 
             * all the elements inside the stack are removed, then that would mean that there are no elements smaller
             * than the current element
             */
            if(sr.isEmpty()){
                sr.push(i);
                nsr[i] = arr.length;
            }
            /*
            * but if the stack is not completely empty then it would mean there is atleast one element
            * that is smaller than the current element. 
            */
            else{
                nsr[i] = sr.peek();
            }
            sr.push(i);
        }

        //next smaller left
        Stack<Integer> sl = new Stack<>();
        for(int i = 0; i < arr.length; i++){
            while(!sl.isEmpty() && arr[sl.peek()] >= arr[i]){
                sl.pop();
            }
            if(sl.isEmpty()){
                sl.push(i);
                nsl[i] = -1;
            }else{
                nsl[i] = sl.peek();
            }
            sl.push(i);
        }

        //area calculation
        for(int i = 0; i < arr.length; i++){
            int area = arr[i] * (nsr[i] - nsl[i] - 1);

            if(area > maxArea){
                maxArea = area;
            }
        }
        System.out.println("max-area : " + maxArea);
    }
    public static void main(String args[]){
        int arr[] = {2, 1, 5, 6, 2, 3};

        area(arr);

    }
}
