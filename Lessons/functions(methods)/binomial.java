import java.util.*;
public class binomial {
    public static int prod(int a){
        int prod = 1; 
        for(int i = 1; i<=a; i++){
            prod = prod*i;
        }
        return prod;
    }
    public static int bin(int a, int b){
        int bino;
        bino = (prod(a) / (prod(b) * prod(a-b)));
        return bino;
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int r = sc.nextInt();
        System.out.println(bin(n,r));
    }
}
