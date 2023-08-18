import java.util.*;
public class prime1 {
    public static boolean IS_prime(int a){
        if(a == 2){
            return false;
        }
        for(int i=2; i<=(a-1); i++){
            if(a%i == 0){
                return false;
            }
        }
        return true;
    }    
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println(IS_prime(sc.nextInt()));
    }
}
