/* 
* given two stack data structures S1 and S2, make a queue data structures using these two stacks
* two approaches : one where add() operation on the stack is O(n) and the rest are O(1); other where add() is O(1) and the others O(n)
* keep in mind: the 'front' of queue corresponds to the 'top' of the stack, while the 'rear' of the queue corresponds to the 'bottom' of stack
*/

import java.util.Stack;

public class stckqueue {
   static class Queue{
     //creating the requisite stacks
    static Stack<Integer> s1 = new Stack<>(); static Stack<Integer> s2 = new Stack<>();

    // isEmpty() method for queue (might be useful in main())
    public static boolean isEmpty(){
        return s1.isEmpty();
    }

    //add operation
    public void add(int data){
            // move the data from s1 to s2
            while(!s1.isEmpty()){
                s2.push(s1.pop());
            }
            // push the new entry in s1 (when it becomes / if it is already) empty
            s1.push(data);
            //push the data of s1 back into it
            while(!s2.isEmpty()){
                s1.push(s2.pop());
            }
    }

    //remove operation
    public int remove(){
        if(s1.isEmpty()){
            System.out.println("queue is empty");
            return -1;
        }else{
            return s1.pop();
        }
    }

    //peek operation
    public int peek(){
        if(s1.isEmpty()){
            System.out.println("queue is empty");
            return -1;
        }else{
            return s1.peek();
        }
    }
   }
   public static void main(String args[]){
    Queue q = new Queue();
    q.add(0); q.add(1); q.add(2);
    while(!q.isEmpty()){
        System.out.println(q.peek());
        q.remove();
    }
   }
}
