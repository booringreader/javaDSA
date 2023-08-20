import java.util.*;
public class range {
    public static boolean primeloop(int a){
            for(int i=2; i <= Math.sqrt(a); i++){
                if(a == 2){
                    return true;
                }
                if(a % i == 0){
                    return false;
                }
            }
            return true;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();

        for(int i = x; i <= y; i++){
            if(primeloop(i) == true){
                System.out.print(i+ " ");
            }else 
            continue;
        }

        
    }
}
