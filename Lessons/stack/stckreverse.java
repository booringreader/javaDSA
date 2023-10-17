import java.util.Stack;
public class stckreverse {
    public static void pushb(Stack<Integer> st, int data){
        if(st.isEmpty()){
            st.push(data);
            return;
        }
        int top = st.pop();
        pushb(st, data);
        st.push(top);
    }
    public static void reverse(Stack<Integer> s){
        if(s.isEmpty()){
            return;
        }
        int top = s.pop();
        reverse(s);
        pushb(s, top);
    }
    public static void printst(Stack<Integer> s){
        while(!s.isEmpty()){
            System.out.println(s.pop());
        }
    }
    public static void main(String args[]){
        Stack<Integer> s = new Stack<>();
        s.push(443); s.push(444); s.push(445); s.push(446);
        reverse(s);
        printst(s);
    }
}
