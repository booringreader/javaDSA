import java.util.*;
public class charp {
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        int input = sc.nextInt();
        char ch = 'A';

        for(int i=0; i<input; i++){
            for(int j=0; j<=i; j++){
                System.out.print(ch + " ");
                ch++  ;
            }
            System.out.println();
        }
    }
}
