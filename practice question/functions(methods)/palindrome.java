import java.util.*;
public class palindrome {
    public static boolean isPalin(int number){
        int n = number;
        int counter = 0;
        int reverse = 0;

        while(n > 0){
            reverse = (reverse*10) + (n%10);
            counter++;
            n = n/10;
        }
                if(reverse != number){
            return false;
        }
        return true;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
            int a = sc.nextInt();
            System.out.println(isPalin(a));
        
    }
}
