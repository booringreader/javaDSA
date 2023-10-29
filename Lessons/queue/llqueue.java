public class llqueue {
    static class Node{
        int data;
        Node next; // 'next' is an object of class Node
        
        //constructor
        Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    static class Queue{
        Queue(int data){

        }
        public static Node head, tail;

        public static boolean isEmpty(){
            return head == null && tail == null;
        }

        public static void add(int data){
            Node newNode = new Node(data);
            if(head == null){
                head = tail = newNode;
                return;
            }
            //addition is in rear
            tail.next = newNode;
            tail = newNode;
        }
        public static int remove(){
            if(isEmpty()){
                System.out.println("queue is empty");
                return -1;
            }
            //removal is from front
            int output = head.data;
            //corner cases
            if(head == tail){
                head = tail = null;
            }else{
                head = head.next;
                // head.next = head;     this will remove the head from the linked list
            }
            return output;
        }
        public static int peek(){
            if(isEmpty()){
                System.out.println("queue is empty");
                return -1;
            }
            //data taken from the front
            return head.data;
        }
    }
    public static void main(String args[]){
        Queue q1 = new Queue(0);
        //queue follows FIFO
        q1.add(0);q1.add(1);q1.add(2); q1.add(3);
        while(!q1.isEmpty()){
            System.out.println(q1.peek());
            q1.remove();
        }
    }
}
