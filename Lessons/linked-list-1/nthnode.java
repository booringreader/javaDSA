public class nthnode {
     public class NODE{
        int data;
        NODE next;

        public NODE(int data){
            this.data = data;
            this.next = null;
        }
    }
    public static NODE head; 
    public static NODE tail;

    public void addFirst(int data){
        NODE new_node = new NODE(data);
        if(head == null){
            head = tail = new_node;
            return;
        }
        new_node.next = head;
        head = new_node;

    }
    public void addLast(int data){
        NODE new_node = new NODE(data);
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
    public void remov(int n){
        int size = 0;
        NODE temp = head;
        while(temp != null){
            temp = temp.next;
            size++;
        }
        if(n == size){
            head = head.next;
            return;
        }
        int i = 1;
        temp = head;
        while(i < size-n){
            temp = temp.next;
            i++;
        }
        temp.next = temp.next.next;
        return;
    }
    public static void main(String args[]){
        nthnode ll = new nthnode();
        ll.addFirst(4); ll.addFirst(3); ll.addFirst(2); ll.addFirst(1);
        ll.print();
        ll.remov(4);
        ll.print();
    }
}
