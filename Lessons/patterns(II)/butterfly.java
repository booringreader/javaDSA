import java.util.*;
public class butterfly {
// public static void butt(int n){
//     for(int i = 0; i < n; i++){
//         for(int j = 0; j < (2*n); j++){
//             if(i < j && j < (2*(n-i-1))){
//                 System.out.print(" ");
//             }else{
//                 System.out.print("* ");
//             }
//         }
//         System.out.println();
//     }
// }
public static void butterfly(int a){
    for(int i = 1; i <= a; i++){
        for(int j = 1; j <= i; j++){
            System.out.print("*");
        }
        for(int j = 1; j <= 2*(a-i); j++){
            System.out.print(" ");
        }
        for(int j = 1; j <= i; j++){
            System.out.print("*");
        }
        System.out.println();
    }
}
public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();

    butterfly(n);
}
}
