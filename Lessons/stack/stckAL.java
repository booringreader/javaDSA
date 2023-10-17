import java.util.ArrayList;
import java.util.Stack;
public class stckAL {
    static class StackA{
        static ArrayList <Integer> list = new ArrayList<>();
        // 4 methods for a stack: push, pop, peek, isempty

        //is empty
        public static boolean is_empty(){
            return list.size() == 0;
        }
        //push
        public static void push(int data){
            list.add(data);
        }
        //pop
        public static int pop(){
            if(is_empty()){
                return -1;
            }
            int top = list.get(list.size()-1);
            list.remove(list.size()-1);
            return top;
        }
        //peek
        public static int peek(){
            return list.get(list.size()-1);
        }
    }    
    public static void main(String args[]){
        StackA s = new StackA();
        s.push(0); s.push(1); s.push(1); s.push(3455); s.push(47502);
        while(!s.is_empty()){
            System.out.println(s.peek());
            s.pop();
        }
    }
}
