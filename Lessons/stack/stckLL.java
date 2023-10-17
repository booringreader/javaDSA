public class stckLL {
    static class Node{
        int data;
        Node next;

         Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    static class stack{
        static Node head = null;

        public static boolean is_empty(){
            return head == null;
        }        
        public static void push(int data){
            Node newNode = new Node(data);
            if(is_empty()){
                head = newNode;
                return;
            }else{
                newNode.next = head;
                head = newNode;
                return;
            }   
        }
        public static int pop(){
            if(is_empty()){
                return -1;
            }
            int top = head.data;
            head = head.next;
            return top;
        }
        public static int peek(){
            if(is_empty()){
                return -1;
            }
            return head.data;
        }
    }

    public static void main(String args[]){
        stack s = new stack();
        s.push(0); s.push(2); s.push(45); s.push(556); s.push(523);
        while(!s.is_empty()){
            System.out.println(s.peek());
            s.pop();
        }  
    }
}
