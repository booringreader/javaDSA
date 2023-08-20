import java.util.*;
public class invertedpyramid {
    public static void pyramid(int a){
        for(int i = 0; i < a; i++){
            for(int j = 0; j < a; j++){
                if(j < (a-i-1)){
                    System.out.print(" ");
                }else{
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();

        pyramid(row);
    }    
}
