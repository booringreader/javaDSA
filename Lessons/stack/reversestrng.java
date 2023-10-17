import java.util.Stack;
public class reversestrng {
    public static String rev(String str){
        Stack<Character> s = new Stack<>();
        int i = 0;
        while(i < str.length()){
            s.push(str.charAt(i));
            i++;
        }
        StringBuilder str2 = new StringBuilder("");
        while(!s.isEmpty()){
            str2.append(s.pop());
        }
        return str2.toString(); //stringbuilder and string are of different types
    }
    public static void main(String args[]){
        String str = "bluebird";
        System.out.println(rev(str));
    }
}
