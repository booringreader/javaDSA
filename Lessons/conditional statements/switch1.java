import java.util.*;
public class switch1 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        char day = sc.next().charAt(0);
         switch(day){
            case 's' : System.out.println("so jao");
                break;
            case 'm' : System.out.println("kaam karo");
                break;
            case 't' : System.out.println("aur kaam karo");
                break;
            case 'w' : System.out.println("thoda sa aur kaam karo");
                break;
            default : System.out.println("system failure");
                break;
        }
       
    }
}
