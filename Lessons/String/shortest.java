import java.util.*;
public class shortest {
    public static void shortp(String str){
        int x = 0, y = 0;
        for(int i = 0; i < str.length(); i++){
            char ch = str.charAt(i);
            switch(ch){
            case 'N' : y++;
                break;
            case 'S' : y--;
                break;
            case 'E' : x++;
                break;
            case 'W' : x--;
                break;
            }
        }
    
        double distance = Math.sqrt(Math.pow(x,2) + Math.pow(y,2));//sqrt return double
        System.out.println(distance);
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("input: ");
        String str = sc.next();

        shortp(str);
    }
}
