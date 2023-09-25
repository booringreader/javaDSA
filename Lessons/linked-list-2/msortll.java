public class msortll {
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
    public Node mid(Node head){
        Node fast = head;
        Node slow = head;

        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
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
       private Node merge(Node head1, Node head2){
        Node mergedLL = new Node(-1);
        Node temp = mergedLL;

        while(head1 != null && head2 != null){
            if(head1.data <= head2.data){
                temp.next = head1;
                head1 = head1.next;
                temp = temp.next;
            }else{
                temp.next = head2;
                head2 = head2.next;
                temp = temp.next;
            }
        }
        //in case head2 reaches null first
        while(head1 != null){
            temp.next = head1;
            head1 = head1.next;
            temp = temp.next;
        }
        //in case head1 reaches null first
        while(head2 != null){
            temp.next = head2;
            head2 = head2.next;
            temp = temp.next;
        }
        return mergedLL.next;
    }
    public Node msort(Node head){
        Node middle = mid(head);
        Node rhead = middle.next;
        middle.next = null;
        Node lmerge = msort(head);
        Node rmerge = msort(rhead);

        return merge(lmerge, rmerge);
    }   
    public static void main(String args[]){
        msortll ll = new msortll();
        ll.addFirst(1); ll.addFirst(100); ll.addFirst(8);
        ll.print();
        ll.head = ll.msort(ll.head);
    }
}
