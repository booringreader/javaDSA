public class circularque {
    static class Queue{
        static int arr[];
        static int front, rear, size;

        Queue(int n){
            arr = new int[n];
            size = n;
            rear = -1;
            front = -1;
        }

        public static boolean isEmpty(){
            return rear == -1 && front == -1;
        }
        public static boolean isFull(){
            return (rear+1)%size == front;
        }

        public static int remove(){
            if(isEmpty()){
                System.out.println("queue is empty");
                return -1;
            }
            int output = arr[front];
            // check for corner case of removing the last element, where front and rear would be on the same index
            if(front == rear){
                front = rear = -1;
            }else{
                front=(front+1)%size;
            }
            return output;
        }
        public static void add(int data){
            if(isFull()){
                System.out.println("queue is full");
            }
            //to check whether the number to be added is a corner case (of first entry) or not
            if(front == -1){
                front = (front+1)%size;
            }
            // addition is done from the rear side and not from the front side.
            rear = (rear+1)%size;
            arr[rear] = data;
        }
        public static int peek(){
            //corner cases
            if(isEmpty()){
                System.out.println("queue is empty");
                return -1;
            }
            //peeking is done from the front side
            return arr[front];
        }
    }
    public static void main(String args[]){
        Queue q1 = new Queue(4);
        //queue follows FIFO
        q1.add(0);q1.add(1);q1.add(2); q1.add(3);

        System.out.print(q1.remove() + " end ");
        q1.add(4);
        System.out.print(q1.remove() + " end ");
        q1.add(5);
        while(!q1.isEmpty()){
            System.out.println(q1.peek());
            q1.remove();
        }
    }
}
