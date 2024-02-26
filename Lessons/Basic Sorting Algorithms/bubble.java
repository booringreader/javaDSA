//reducing time complexity for best case
/*
 * Bubble sort:
 * when fluids boil, bubbles are formed and they move to the ends of the container - inspired from the phenomenon bubble sort is based on similar idea
 * the largest or the smalles elements swap with the elements next to them (incase the adjacent elements are larger(or smaller)) and keep moving forward to the end
 * each element keep getting compared until it reaches the potential end of it's position (i.e no element larger (or smaller) than it is left)
 */
import java.util.*;
public class bubble {
    /* Brute force approach:
     * 
     * public static void bubbleSORT(int ARR[]){
     *      for(int turn=0; turn<ARR.length-1; turn++){
     *          for(int j=0; j<ARR.length-1-turn; j++){
     *              if(ARR[j] > ARR[j+1]){
     *                  int temp = ARR[j+1];
     *                  ARR[j+1] = ARR[j];
     *                  ARR[j] = temp;
     *              }
     *          }
     *      }
     * }
     */
    public static void bubbles(int arr[]){
        int counter = 0, swap =0;
        int n = arr.length;
        while(counter < n){
            for(int i = 0; i < arr.length-1; i++){
                int temp;
                if(arr[i] > arr[i+1]){
                    temp = arr[i+1];
                    System.out.println("temp: " + temp);
                    arr[i+1] = arr[i];
                    arr[i] = temp;
                    swap++;
                }
                if(swap < 1)
                    break;
            }
            counter++;
        }
        for(int i = 0; i <arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }    
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int input[] = new int[5];

        for(int i = 0; i < input.length; i++){
            input[i] = sc.nextInt();
        }

        bubbles(input);
    }
}


/*     public static void bubbles(int arr[]){
        int counter = 0;
        int n = arr.length;
        while(counter < n){
            for(int i = 0; i < arr.length-1; i++){
                int temp;
                if(arr[i] > arr[i+1]){
                    temp = arr[i+1];
                    System.out.println("temp: " + temp);
                    arr[i+1] = arr[i];
                    arr[i] = temp;
                }
            }
            counter++;
        }
        for(int i = 0; i <arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }    
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int input[] = new int[5];

        for(int i = 0; i < input.length; i++){
            input[i] = sc.nextInt();
        }

        bubbles(input);
    } }
*/