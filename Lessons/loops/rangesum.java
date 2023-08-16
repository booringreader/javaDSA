import java.util.*;
public class rangesum {
    public static void main(String args[]){
        int sum = 0;
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int counter = 1;
        while(counter <= n){
            sum += counter;
            counter++;
        }
        System.out.println(sum);
    }
}
