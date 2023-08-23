import java.util.*;
public class linearSearch {
    public static void main(String args[]){
        int arr[] = new int[4];
        Scanner sc = new Scanner(System.in);
        for(int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }
        int key = 47;
        System.out.println();
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == key){
                System.out.println(i);
            }
        }
    }
}
