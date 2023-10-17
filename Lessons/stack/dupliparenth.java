import java.util.Stack;

public class dupliparenth {
    public static boolean dup(String str){
        Stack <Character> s = new Stack<>();
        for(int i = 0; i < str.length(); i++){
            char ch = str.charAt(i);
            if(ch != ')' || ch != '}' || ch != ']'){
                s.push(ch);
            }else{
                int count = 0;
                if((s.peek() != '(' && ch==')') || (s.peek() != '{' && ch=='}') || (s.peek() != '[' && ch==']')){
                    count++;
                    s.pop();
                }else if((s.peek()=='(' && ch==')') || (s.peek()=='{' && ch=='}') || (s.peek()=='[' && ch==']')){
                    if(count < 1){
                        return true;
                    }else
                    return false;
                }
            }
        }
    }
}
