import java.util.*;
public class fact {
    public static int facto(int a){
        int prod = 1;
        for(int i = 1; i <= a; i++){
            prod = prod * i;
        }
        return prod;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.println(facto(a));
    }
}
