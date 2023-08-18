import java.util.*;
public class funcOverloading {
    public static int product(int a, int b){
        int prod = a*b;
        return prod;
    }
    public static float product(float a, float b){
        float prod = a*b;
        return prod;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        float m = sc.nextFloat();
        float n = sc.nextFloat();

        System.out.println(product(x, y) + " , " +product(m, n));
    }
}
