import java.util.*;
public class q4 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();

        for(int i = 1; i<= 10; i++){
            int table = input * i;
            System.out.print(table + " ");
        }
    }
}
