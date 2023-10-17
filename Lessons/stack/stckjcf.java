import java.util.Stack;

public class stckjcf {
    public static void main(String args[]){
        Stack<Integer> s = new Stack<>();
        s.push(334); s.push(523); s.push(52358);
        while(!s.isEmpty()){
            System.out.println(s.peek());
            s.pop();
        }
    }
}
