import java.util.*;
public class stckdeq {
    static class Stack{
    static Deque<Integer> stck = new LinkedList<>();

    public static boolean isEmpty(){
        return stck.isEmpty();
    } // isEmpty() method for the class
    public static void push(int data){
        stck.addFirst(data);
    }
    public static int pop(){
        if(isEmpty()){
            System.out.println("stack is empty");
            return -1;
        }
        return stck.removeFirst();
    }
    public static int peek(){
        if(isEmpty()){
            System.out.println("stack is empty");
            return -1;
        }
        return stck.getFirst();
    }
    }
    public static void main(String args[]){
        Stack s = new Stack();
        s.push(0); s.push(1); s.push(2); s.push(3);
        while(!s.isEmpty()){
            System.out.println(s.peek());
            s.pop();
        }
    }
}
