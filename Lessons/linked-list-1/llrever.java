public class llrever {
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
    public void reverse(){
        NODE prev = null;
        NODE current = tail = head;
        NODE next;

        while(current != null){
            next = current.next;
            current.next = prev;
            prev = current;
            current = next; //if this one is executed first then there would be two 'current' nodes and bothe would be converted to prev in the following step
        }
        head = prev;
    }
    public static void main(String args[]){
        llrever ll = new llrever();
        ll.addFirst(4); ll.addFirst(3); ll.addFirst(2); ll.addFirst(1);
        ll.print();
        ll.reverse();
        ll.print();
    }
}
