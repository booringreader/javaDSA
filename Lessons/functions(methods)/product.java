import java.util.*;
public class product {
    public static int prod(int x, int y){
        int prod = x*y;
        return prod;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        int p = prod(a, b);
        System.out.println(p);

    }
}
