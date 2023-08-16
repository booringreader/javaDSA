import java.util.*;
public class reversenum{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        int rev = 0;
        int n = input;

        while(n>0){
            int last_digit = n%10;
            rev = (rev*10) + last_digit;
            n = n/10;
        }
        System.out.println(rev);
    }
}