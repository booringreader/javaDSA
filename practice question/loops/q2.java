import java.util.*;
public class q2 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        int even = 0;
        int odd = 0;

        int n = input;
        while(n > 0){
            int last_digit = n%10;
            if(last_digit%2 == 0){
                even+=last_digit;
            }else{
                odd+=last_digit;
            }
            n = n/10;
        }
        System.out.println("odd: " + odd);
        System.out.println("even: " + even);
    }
}
