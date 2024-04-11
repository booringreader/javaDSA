// given a sorted array, make a balanced bst from it 
// balanced implies bst should not be skewed

/*          8
 *         / \
 *        /   \
 *       5     11
 *      / \   /  \
 *     3   6 10   12
 *      EXPECTED BST
*/

public class arrtobst{
    static class Node{
        int data;
        Node left, right;

        public Node(int data){
            this.data = data;
        }
    }
    
    public static Node bst(int arr[], int si, int ei){
       // find middle index of array
       // make a node of the middle element
       // recursively call bst() for the elements to the left and right of the mid idx
       // assign the left returns to the root.left and right returns to the root.right  
        if(si > ei){
            return null;
        }
        int mid = (si+ei)/2;
        Node root = new Node(arr[mid]); // turn the middle element of the array into a node
        
        root.left =  bst(arr, si, mid-1); // left subtree
        root.right =  bst(arr, mid+1, ei); // right subtree
        
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
        int values[] = {3, 5, 6, 8, 10, 11, 12};
        Node root = bst(values, 0, values.length-1);
        inOrder(root);
    }
}
