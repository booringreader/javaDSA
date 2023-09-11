import java.util.*;
public class substring {
    public static void sub(String str, int si, int ei){
        for(int i = si; i < ei; i++){
            System.out.print(str.charAt(i));
        }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.print("input: ");
        String input = sc.nextLine();
        System.out.print("input and output" + " ");
        int si = sc.nextInt();
        int ei = sc.nextInt();
        sub(input, si, ei);
    }
}
