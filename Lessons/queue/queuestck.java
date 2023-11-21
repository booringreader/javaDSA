/*
* two Queue data structures are given, make a stack data structure from these
* same two methods as mentioned in 'stckqueue.java', we will use the one where add() method is O(1).
* two logics for implementing pop() method: one- use a do while loop to peek() for the last element from queue, 
*/

import java.util.*;

public class queuestck {
   static class stack{
     static Queue<Integer> q1 = new LinkedList<>(); static Queue<Integer> q2 = new LinkedList<>();
    
    //isEmpty method (for stack)
    public static boolean isEmpty(){
        return q1.isEmpty() && q2.isEmpty();
    }

    //push method
    public static void push(int data){
        // not(P and Q) is (not(P) or not(Q)) 
        // both queues won't be filled at the same time, so if one is filled then the other must be empty
        if(!q1.isEmpty()){
            q1.add(data);
        }else{
            q2.add(data);
        }
    }

    //pop method
    public static int pop(){
        // if both the queues are empty then the entire stack is empty; no elements to pop
        if(isEmpty()){
            System.out.println("stack is empty");
            return -1;
        }
        //in case the 'stack' is empty then the following block of code won't get executed, if it is not then ...
        /*
        * check if one of the queues (say q1) is not empty, if yes, then remove elements from it (remove returns the element removed), otherwise q2 would be non
        * non empty (because the previous block of code was not executed)
        */
        int output=-1;
            if(!q1.isEmpty()){
                while(!q1.isEmpty()){
                    output = q1.remove();
                    if(q1.isEmpty()){
                        break;
                    }
                    q2.add(output);
                }
            }else{
               while(!q2.isEmpty()){
                output = q2.remove();
                if(q2.isEmpty()){
                    break;
                }
                q1.add(output);
               }
            }
        return output;
    }

    //peek method
       public static int peek(){
        if(isEmpty()){
            System.out.println("stack is empty");
            return -1;
        }
        int output=-1;
            if(!q1.isEmpty()){
                while(!q1.isEmpty()){
                    output = q1.remove();
                    q2.add(output);
                }
            }else{
               while(!q2.isEmpty()){
                output = q2.remove();
                q1.add(output);
               }
            }
        return output;
    }
   }
   public static void main(String args[]){
    stack s = new stack();
    s.push(1); s.push(2); s.push(3);
    while(!s.isEmpty()){
        System.out.println(s.pop());
    }
   }
}
