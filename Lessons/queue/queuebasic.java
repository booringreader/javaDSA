public class queuebasic {
    static class Queue{
        static int arr[];
        static int rear, size;

        Queue(int n){
            arr = new int[n];
            size = n;
            rear = -1;
        }
        public static boolean isEmpty(){
            /* returns the result of the comparison rear == -1
            *  if value of rear is equal to -1 then returns true
            * else returns false.
            */ 
            return rear == -1;
        }

        public static void add(int data){
            rear = rear + 1;
            arr[rear] = data;
        }
// removes the element from the front
        public static int remove(){
            //check if the queue is empty
            if(isEmpty()){
                System.out.println("queue empty");
                //if it is empty, then print out a message and return error code
                return -1;
            }
            int front = arr[0];
            for(int i = 0; i < rear; i++){
                arr[i] = arr[i+1];
            }
            rear--;
            return front;
        }
        public static int peek(){
            if(isEmpty()){
                System.out.println("queue empty");
                return -1;  
            }
            int front = arr[0];
            return front;
        }
    }
    public static void main(String args[]){
        Queue q1 = new Queue(5);
        //queue follows FIFO
        q1.add(3); q1.add(2); q1.add(1);q1.add(0);
        while(!q1.isEmpty()){
            System.out.println(q1.peek());
            q1.remove();
        }
    }
}
