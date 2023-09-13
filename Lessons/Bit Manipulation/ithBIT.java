import java.util.*;
public class ithBIT {
    public static void get(int n, int k){
        int bitMask = (1<<k);
        if((n & bitMask) != 0){
            System.out.println("1");
        }else
        System.out.println("0");
    }
    public static void set(int t, int j){
        int bitMask = (1<<j);
        System.out.println((t | bitMask));
    }  
    public static void clear(int r, int l){
        int bitMask = (1<<l);
        System.out.println(r & ~(bitMask));
    }
    public static void update(int num, int i, int val){
        if(val == 0){
            clear(num, i);
        }else if(val == 1){
            set(num,i);
        }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("input, key & value ");
        int input = sc.nextInt();
        int key = sc.nextInt();
        int value = sc.nextInt();

        update(input, key, value);
    }
}
