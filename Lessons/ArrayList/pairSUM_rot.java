import java.util.ArrayList;
import java.util.Scanner;

public class pairSUM_rot {
     public static void sum(ArrayList<Integer> list, int key){
        int Left_Pointer = 2, Right_Pointer = 1;

        while(Left_Pointer != Right_Pointer){
            int Left_PointerValue = list.get(Left_Pointer), Right_PointerValue= list.get(Right_Pointer);
            int sum = Left_PointerValue + Right_PointerValue;
            if(sum == key){
                System.out.println("true");
                break;
            }
            if(sum < key){
                Left_Pointer = (Left_Pointer + 1)%list.size();
            }else if(sum > key){
                Right_Pointer = (list.size() + Right_Pointer - 1)%list.size();
            }
        }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();

        list.add(11); list.add(15); list.add(6); 
        list.add(8); list.add(9); list.add(10);
          
        int key = sc.nextInt();

        sum(list, key);
    }
}
