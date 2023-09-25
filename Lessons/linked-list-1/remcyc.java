public class remcyc {
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
        public static boolean cycle(){
            Node fast=head; Node slow = head;
    
            while(fast != null && fast.next != null){
                slow = slow.next;
                fast = fast.next.next;
                if(fast == slow){
                    return true;
                }
            }
            return false;
        }
        public static void remcy(){
         Node fast=head; Node slow = head;
         int flag = 0;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
            if(fast == slow){
                flag = 1;
                break;
            }
        }
        if(flag == 0){
            return;
        }
        slow = head;
        Node prev = null;
        while(fast != slow){
            prev = fast;
            slow = slow.next;
            fast = fast.next;
        }
        prev.next = null;
    }
        
    public static void main(String args[]){
        head = new Node(1);
        // instead of taking the entire linked list in the loop; now the loop will be a section of the list
        Node intern = new Node(428883);
        head.next = intern;
        head.next.next = new Node(4428);
        head.next.next.next = new Node(132981);
        head.next.next.next.next = intern;
        System.out.println(cycle());
        remcy();
        System.out.println(cycle());
    }
}   
