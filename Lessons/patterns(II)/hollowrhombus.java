import java.util.*;
public class hollowrhombus {
    public static void rhom(int n){
        for(int i = 0; i < n; i++){
            //spaces
            for(int j = 0; j < (n-i-1); j++){
                System.out.print(" ");
            }
            //hollow rectangle
            for(int j = 0; j < n; j++){
                if(i == 0 || i == (n-1) || j == 0 || j == (n-1)){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
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
