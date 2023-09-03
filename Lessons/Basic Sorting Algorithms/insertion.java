import java.util.*;
public class insertion{
    public static void insert(int arr[]){
        for(int i = 1; i < arr.length; i++){
            int current = i, back = (i-1);
            int key = arr[current];
            while(back >= 0 && arr[back] > key){
                arr[back + 1] = arr[back];
                back--;
            }
            arr[back+1] = key;
        }
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int input[] = new int[6];

        for(int i = 0; i < input.length; i++){
            input[i] = sc.nextInt();
        }

        insert(input);
    }
}
// public class insertion {
//     public static void insert(int arr[]){
//         // for(int i = 1; i <arr.length; i++){
//         //     int current = i, back = (i-1); //current = (i+1); "the current variable must remain absolute and all other variables should change based on it."
//         //     int key = arr[i];
//         //     while(back >= 0 && arr[back] > key){
//         //         key = arr[current];
//         //         arr[current] = arr[back];
//         //         back--;
//         //     }
//         //     arr[back+1] = key;
//         // }
//     }
// }
