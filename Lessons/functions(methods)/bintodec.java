// import java.util.*;
// public class bintodec {
//      public static int bitodec(int a){
//         int counter = 0;
//         int n = a;
//         int sum = 0;

//         for(int i = 0; i <= counter; i++){
//                 int b = n % 10;
//                 sum += (b*Math.pow(2, i));
//                 n = n / 10; 
//                 System.out.print(sum+ " ");
//                 if(n%10 <= 0)
//                     break;
//         }
//         return sum;
//      }
//      public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);
//         int input = sc.nextInt();
//         System.out.println(bitodec(input));
//      }
// }

import java.util.*;
public class bintodec{
    public static void binTodec(int binNum){
        int pow = 0;
        int decNum = 0;
        while(binNum > 0){
            int lastDigit = binNum % 10;
            decNum = decNum + (lastDigit * (int)Math.pow(2, pow));
            pow++;
            binNum = binNum / 10;
        }
        System.out.println(decNum);
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();

        binTodec(input);
    }
}