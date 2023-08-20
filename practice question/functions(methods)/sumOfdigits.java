import java.util.*;
public class sumOfdigits {
    public static int digSum(int a){
        int sum = 0;
        int last_digit;
        
        while(a > 0){
            last_digit = a % 10;
            sum += last_digit;
            a /= 10;
        }
        return sum;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();

        System.out.println(digSum(input));
    }
}
