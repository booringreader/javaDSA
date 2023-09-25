public class methods {
    public static class NODE{
        int data;
        NODE next;
        
        public NODE(int data){
            this.data = data;
            this.next = null;
        }
    }
    public static NODE head;
    public static NODE tail;

    // not necessary to explicitely clarify the static nature of method since calling through linkedlist ("methods") static nature is irrelevant    
    public void addFirst(int data){
        //step1 = create new NODE
        NODE newNode = new NODE(data);
        if(head == null){
            head = tail = newNode;
            return; 
        }
        //step2 = newNode next assigned to next node
        newNode.next = head;
        // step3 = head assigned to newNOde
        head = newNode; 
    }
    public void addLast(int data){
        NODE new_node = new NODE(data);

        if(head == null){ // empty linked list
            head = tail = new_node;
            return;
        }
        tail.next = new_node;
        tail = new_node;
    }

    public void print(){
        NODE temp = head;
        while(temp != null){
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println("null");
    }
    public static void main(String args[]){
        methods ll = new methods();
        ll.addFirst(1);
        ll.print();
        ll.addFirst(2);
        ll.print();
        ll.addLast(3);
        ll.print();
        ll.addLast(4);
        ll.print();
    }
}
