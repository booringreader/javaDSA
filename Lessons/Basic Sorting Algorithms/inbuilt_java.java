import java.util.*;
import java.util.Arrays;
import java.util.Collections;

public class inbuilt_java {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        Integer input[] = new Integer[8];

        for(int i = 0; i < input.length; i++){
            input[i] = sc.nextInt();
        }

        Arrays.sort(input);
        for(int i = 0; i < input.length; i++){
            System.out.print(input[i] + " ");
        }
        System.out.println();
        
        Arrays.sort(input, Collections.reverseOrder());
        for(int i = 0; i < input.length; i++){
            System.out.print(input[i] + " ");
        }
    }
}
