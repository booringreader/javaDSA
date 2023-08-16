import java.util.*;
public class primeornot {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        int counter = 0;

        for(int i = 1; i <= input; i++){
            if(input%i == 0){
                counter++;
            }else
                continue;
        }
        if(counter > 2){
            System.out.println("not a prime");
        }else
            System.out.println("prime");
    }
}

/*
 for(int i = 2; i< input-1; i++){
    if (input != 2 && input%i == 0){
        System.out.prinln("not prime");
    }else
        System.out.pirntln("prime");
 }
 */

 /*
  for(int i = 0; i <= Math.sqrt(n); i++){
    if(input != 2 && input%i == 0){
        System.out.println("not prime");
    }
  }
  */