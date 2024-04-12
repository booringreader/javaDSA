// mirror a given binary search tree horizontally
// mirror each subtree recursively and assign the returned node to the opposite subnode

/*          8         |         8
 *         / \        |        / \ 
 *        5   10      |       10  5
 *       / \   \      |      /   / \
 *      3   6   11    |     11  6   3
 *         BST              MIRRORED BST      
*/

public class mirrorbst{
    static class Node{
        int data; Node left, right;

        public Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }
   
    public static void inOrder(Node root){
        if(root == null){
            return;
        }

        inOrder(root.left);
        System.out.print(root.data + " ");
        inOrder(root.right);
    }

    public static Node mirror(Node root){
        if(root==null){
           return null; 
        }
        
        // rightSub and leftSub are temporary nodes
        Node rightSub = mirror(root.right);
        Node leftSub = mirror(root.left);

        root.right = leftSub;
        root.left = rightSub;

        return root;
    }
    public static void main(String args[]){
        Node root = new Node(8);
        root.left = new Node(5);
        root.right = new Node(10);
        root.left.left = new Node(3);
        root.left.right = new Node(6);
        root.right.right = new Node(11);
                
        inOrder(root); 
        System.out.println();
        mirror(root);
        inOrder(root);
    }
}
