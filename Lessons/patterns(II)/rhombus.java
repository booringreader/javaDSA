import java.util.*;
public class rhombus {
    public static void rhom(int n){
        for(int i = 0; i < n; i++){
            for(int j = 0; j < (n-i-1); j++){
                System.out.print(" ");
            }
            for(int j = 0; j < n; j++){
                System.out.print("*");
            }
            for(int j = (n-i-1); j < i; j++){
                System.out.print(" ");
            }
            System.out.println();
        }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        rhom(n);
    }
}
