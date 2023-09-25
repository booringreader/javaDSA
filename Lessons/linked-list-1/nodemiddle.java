public class nodemiddle {
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
    public void add(int index, int data){
        NODE new_node = new NODE(data);
        NODE temp = head;
        int i = 0;

        if(index == 0){
            addFirst(data);
        }
        while(i < index-1){
            temp = temp.next;
            i++;
        }
        new_node.next = temp.next;
        temp.next = new_node;
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
        nodemiddle ll = new nodemiddle();
        ll.addFirst(1);
        ll.addFirst(2);
        ll.addFirst(3);
        ll.addFirst(4);
        ll.print();
        ll.add(2, 7);
        ll.print();
    }
}
