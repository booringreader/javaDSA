import java.util.*;
public class compression {
    public static void compress(String str){
        StringBuilder sb = new StringBuilder("");
        sb.append(str.charAt(0));
        int counter = 0;

        for(int i = 1; i < str.length(); i++){
            if(str.charAt(i) == str.charAt(i-1)){
                counter++;
            }else{
               if(counter >= 1){
                 sb.append(counter+1);
               }
                counter = 0;
                sb.append(str.charAt(i));
            }
            if(i == str.length()-1){
                sb.append(counter+1);
            }
        }
        System.out.println(sb);
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("input: ");

        String input = sc.nextLine();

        compress(input);
    }
}
