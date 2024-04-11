// build a binary search tree from 'values[]' array
/*      5
 *     / \
 *    1   7
 *     \
 *      3
 *     / \
 *    2   4
*/

public class buildbst{
    static class Node{
        int data;
        Node left; 
        Node right; 

        public Node(int data){
            this.data = data;
            // left and right subtree by default null
        }
    }
    
    // pass a root node as argument
    // this argument node (root) will be manipulated and returned
    public static Node insert(Node root, int value){  // value is the data that needs to be inserted into the tree
        if(root == null){ // if the passed in node is idle, assign it the value 
            return root = new Node(value); // initialize the argument node with a Node object 
        }

        if(root.data > value){
            // insert into leftsubtree (not left node)
            // find the end of leftsubtree and insert value as an extension to the end of the subtree
            root.left = insert(root.left, value); 
        }else if(root.data < value){
            // insert into rightsubtree (not right node)
            // find the end of rightsubtree and insert value as an extension to the end of the subtree
           root.right = insert(root.right, value); // insert() returns a node (by extension a subtree) which needs to be assigned to something         
        }
        return root;
    }
    public static void inOrder(Node root){
        if(root == null){
            return;
        }
        inOrder(root.left);
        System.out.println(root.data); 
        inOrder(root.right);
    }
    public static void main(String args[]){
        int values[] = {5, 1, 3, 2, 4, 7}; // preorder traversal (root node, left node, right node)
        Node root = null;

        for(int i=0; i<values.length; i++){
            root = insert(root, values[i]);
        }

        inOrder(root);
    }
}
