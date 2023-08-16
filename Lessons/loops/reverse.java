import java.util.*;
public class reverse {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        int n = input;

        while( n > 0 ){
            int last_digit = n%10;
            n /= 10;
            System.out.print(last_digit);
        }
    }
}
