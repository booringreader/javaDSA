import java.util.ArrayList;
import java.util.Scanner;

public class pairSUM_optim {
    public static void sum(ArrayList<Integer> list, int key){
        int Left_Pointer = 0, Right_Pointer = list.size()-1;
        while(Left_Pointer < Right_Pointer){
            int Left_PointerValue = list.get(Left_Pointer), Right_PointerValue= list.get(Right_Pointer);
            int sum = Left_PointerValue + Right_PointerValue;
            if(sum == key){
                System.out.println("true");
                break;
            }
            if(sum < key){
                Left_Pointer++;
            }else if(sum > key){
                Right_Pointer--;
            }
        }
    }
    public static void main(String args[]){
         Scanner sc = new Scanner(System.in);
         ArrayList<Integer> list = new ArrayList<>();
         list.add(1); list.add(2); list.add(3); list.add(4); list.add(5); list.add(6);
          
         int key = sc.nextInt();

         sum(list, key);
    }
}
