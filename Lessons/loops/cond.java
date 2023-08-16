import java.util.*;
public class cond {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int input;

        do{
            input = sc.nextInt();
            if(input%10 == 0)
                break;
            System.out.println(input);
        }while(true);
    }
}
