public class pdrome_node {
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
    public boolean palindrome(){
        //base case
        if(head == null || head.next == null){
            return true;
        }
        //find mid
        Node midNode = mid(head);
        //reverse list from the middle
        Node prev = null;
        Node current = midNode;
        Node next;

        while(current != null){
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        // head = prev; doing this means right and left both start from the same side

        //check symmetry in 1st and 2nd half
        Node right = prev;
        Node left = head;

        while(right != null){
            if(right.data != left.data){
                return false;
            }
            left = left.next;
            right = right.next;
        }
        return true;
    }
    public static void main(String args[]){
          pdrome_node ll = new pdrome_node();
        ll.addFirst(1);
        ll.addFirst(5);
        ll.addFirst(3);
        ll.addFirst(4);
        ll.print();
        System.out.println(ll.palindrome());
    }
}
