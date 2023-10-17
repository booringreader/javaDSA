import java.util.Stack;
public class pushbtm {
    public static void pushb(Stack<Integer> st, int data){
        if(st.isEmpty()){
            st.push(data);
            return;
        }
        int top = st.pop();
        pushb(st, data);
        st.push(top);
    }
    public static void main(String args[]){
        Stack<Integer> s = new Stack<>();
        s.push(432); s.push(25); s.push(5278);
        pushb(s, 700);
        while(!s.isEmpty()){
            System.out.println(s.peek());
            s.pop();
        }
    }
}
