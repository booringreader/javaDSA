import java.util.Stack;

class dupliparenth{
    public static boolean isdup(String str){
        Stack<Character> s = new Stack<>();

        for(int i = 0; i < str.length(); i++){
            if(str.charAt(i) == ')'){
                int count = 0;
                while(s.peek() != '('){
                    count++;
                    s.pop();
                }
                if(count < 1){
                    return true;
                }else{
                    s.pop();
                }
            }else{
                s.push(str.charAt(i));
            }
        }
        return false;
    }
    public static void main(String args[]){
        String str = "((a+b))";
        System.out.println(isdup(str));
        str = "(a+b)";
        System.out.println(isdup(str));
    }
}