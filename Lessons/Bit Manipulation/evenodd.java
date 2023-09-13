import java.util.*;
public class evenodd {
    public static void eo(int n){
        int bitMask = 1;
        if((n & bitMask) == 1){
            System.out.println("odd");
        }else
        System.out.println("even");
    }    
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("input: ");
        int input = sc.nextInt();

        eo(input);
    }
}
