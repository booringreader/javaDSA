import java.util.*;
public class search {
    public static void sea(int key, int arr[][]){
        int i = 0, j = arr.length-1;

        while(i < arr.length && j >= 0){
            if(key == arr[i][j]){
                System.out.println("found");
                break;
            }else if(key < arr[i][j]){
                j--;
            }else if(key > arr[i][j]){
                i++;
            }else {
                System.out.println("no key");
            }
        }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int input[][] = new int[4][4];

        for(int i = 0; i < input.length; i++){
            for(int j = 0; j < input.length; j++){
                input[i][j] = sc.nextInt();
            }
        }
        System.out.print("key: " + " ");
        int key = sc.nextInt();
        sea(key, input);
    }
}
