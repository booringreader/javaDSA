import java.util.*;
public class upper {
    public static void up(String str){
        StringBuilder sb = new StringBuilder("");
        char ch = Character.toUpperCase(str.charAt(0));
        sb.append(ch);

        for(int i = 1; i < str.length(); i++){
            if(str.charAt(i) == ' ' && i < str.length()-1){
                sb.append(str.charAt(i));
                i++;
               ch =  Character.toUpperCase(str.charAt(i));
               sb.append(ch);
            }else{
                sb.append(str.charAt(i));
            }
        }
        System.out.print(sb);
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("input: ");
        String input = sc.nextLine();

        up(input);
    }
}
