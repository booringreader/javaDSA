import java.util.*;
public class floydTriangle {
    public static void floyd(int n){ 
        int seq = 1;
        for(int i = 0; i < n; i++){
            for(int j = 0; j <= i; j++){
                System.out.print(seq + " ");
                seq++;
            }
            System.out.println();
        }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        floyd(n);
    }
}
