public class doubll{
    public class Node{
        int data;
        Node prev, next;
        public Node(int data){
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }    
    public static Node head, tail;
    public static int size;

    public void print(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data+"<->");
            temp = temp.next;
        }
        System.out.println("null");
    }
    //add   
    public void addFirst(int data){
        size++;
        Node newNode = new Node(data);
        if(head == null){
            head = tail = newNode;
            return;
        }
        head.prev = newNode;
        newNode.next = head;
        head = newNode;
    }
    public void removeFirst(){
        head = head.next;
        head.prev = null;
    }
    public void reverse(){
        Node curr= head, prev = null, next;
        while(curr != null){
            next = curr.next;
            curr.next = prev;
            curr.prev = next;
            prev = curr;
            curr = next;
        }
        head = prev;
    }
    public static void main(String args[]){
        doubll Dll = new doubll();
        Dll.addFirst(0); Dll.addFirst(1); Dll.addFirst(2);
        Dll.print();;
        Dll.reverse();
        Dll.print();
    }
}
