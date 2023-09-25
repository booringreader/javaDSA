public class zigzag {
    public static class Node{
        int data;
        Node next;
        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    public static Node head;
    public static Node tail;

    public void print(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println("null");
    }
    public void addFirst(int data){
        //step1 = create new Node
        Node newNode = new Node(data);
        if(head == null){
            head = tail = newNode;
            return; 
        }
        //step2 = newNode next assigned to next Node
        newNode.next = head;
        // step3 = head assigned to newNode
        head = newNode; 
    }
    public void zz(){
        // step1 - find mid
        Node fast = head;
        Node slow = head;

        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }

        // reverse the second half
        Node prev = null;
        Node current = slow.next;
        slow.next = null;
        Node next;

        while(current != null){
            next = current.next;
            current.next = prev;
            prev = current;
            current = next; //if this one is executed first then there would be two 'current' nodes and bothe would be converted to prev in the following step
        }
        Node lhead = head;
        Node rhead = prev;

        //zig zag
        while(lhead != null && rhead != null){
            Node nextleft = lhead.next;
            lhead.next = rhead;
            Node nextright = rhead.next;
            rhead.next = nextleft;
            rhead = nextright;
            lhead = nextleft;
        }
    }
    public static void main(String args[]){
        zigzag ll = new zigzag();
        ll.addFirst(0); ll.addFirst(1); ll.addFirst(2); ll.addFirst(3); ll.addFirst(4);
        ll.print();
        ll.zz();
        ll.print();
    }    
}
