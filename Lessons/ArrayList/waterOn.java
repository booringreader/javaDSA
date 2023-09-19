import java.util.*;
public class waterOn {
    public static void cont(int arr[]){
        int Left_Pointer = 0;
        int Right_Pointer = arr.length-1;
        int water, mostWater = Integer.MIN_VALUE;

        while(Left_Pointer < Right_Pointer){
        int Left_Pointerheight = arr[Left_Pointer], Right_Pointerheight = arr[Right_Pointer];

            water = Math.min(Right_Pointerheight, Left_Pointerheight) * (Right_Pointer-Left_Pointer);
            mostWater = Math.max(mostWater, water);

            if(Left_Pointerheight < Right_Pointerheight){
                Left_Pointer++;
            }else{
                Right_Pointer--;
            }
        }
        System.out.println("most water : " + mostWater);
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int input[] = new int[9];

        for(int i = 0; i < input.length; i++){
            input[i] = sc.nextInt();
        }
        cont(input);
    }
}
