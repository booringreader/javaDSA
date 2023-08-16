import java.util.*;
public class q3 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        int fact = 1;
        for(int i = 2; i<=input; i++){
            fact *= i;
        }
        System.out.println(fact);
    }
}
