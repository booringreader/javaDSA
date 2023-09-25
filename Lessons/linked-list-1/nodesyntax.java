public class nodesyntax { // 'nodesyntax' is the name of the linked list class
    
// creating one node or (data + address) segment of the linked list
// this can also be referred as the boxes that will exist between the head and the tail
    public static class Node{    
        int data;
        Node next;

        public Node(int data){
        this.data = data;
        this.next = null;
        }
    }

    //creating head and tail of the linked list
    public static Node head;
    public static Node tail; 

    public static void main(String args[]){

        // creating an object of class nodesyntax
        nodesyntax ll = new nodesyntax();

        // filling data in the properties of the nodesyntax class ( which also happen to be the node of the supposed linked list)
        ll.head = new Node(1); // node head with data '1' is created
        ll.head.next = new Node(2)  // node next to head with data '2' is created
        
        /* to avoid manually assigning value to the node segments we
         * create methods in the nodesyntax class
         */
    }
}
