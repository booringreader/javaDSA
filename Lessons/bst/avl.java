/*
 *              30
 *             /  \ 
 *            20   40       AVL TREE
 *           /  \    \ 
 *          10   25   50
*/



public class avl{
    static class Node{
        int data, height; // node stores it's height as well
        Node left, right; 
        public Node(int data){
            this.data=data;
            height = 1;
        }
    }
    public static Node root; // root for the entire tree
    
    // takes root of tree as input and returns its height
    public static int height(Node root){ 
        if(root==null){
            return 0;
        }

        return root.height; // height already stored in the Node
    } 
    
    // right rotating subtree with root y
    public static Node rightRotate(Node y){
        Node x = y.left;
        Node t2 = x.right;

        x.right = y;
        y.left = t2;

        x.height = Math.max(height(x.left), height(x.right)) + 1;
        y.height = Math.max(height(y.left), height(y.right)) + 1;
        return x;
    }

    // left roatating subtree with root x
    public static Node leftRotate(Node x){
        Node y = x.right;
        Node t2 = y.left;

        // rotation
        y.left = x;
        x.right = t2;

        // new heights
        x.height = Math.max(height(x.left), height(x.right))+1;
        y.height = Math.max(height(y.left), height(y.right))+1;
        
        // return new node
        return y;
    }
    // function to get balance factor of a node
    public static int getbf(Node root){
        if(root==null) // leaf node
            return 0;
        return height(root.left)-height(root.right);
    }


    // insert function to insert key values in the existing tree
    public static Node insert(Node root, int key){
        if(root==null) // no existing tree, insert a new node
            return new Node(key);

        if(key <root.data)
            root.left = insert(root.left, key);
        else if(key > root.data)
            root.right = insert(root.right, key);
        else 
            return root; // key equal to root data i.e repeated nodes
        
        // update height
        root.height = Math.max(height(root.left), height(root.right));

        // root's balance factor
        // balance factor is necessary to check if the tree has become unbalanced
        // if bf(!= 0, -1, 1), tree has become unbalanced post insertion of key
        int bf = getbf(root);


        // handling of unbalanced cases (in case tree becomes unbalanced post insertion)
        
        // LL (left of left)
        // right rotation
        // in left left, the node is inserted to the left of node
        // this would increase the bf (lh-rh)
        if(bf>1 && key < root.left.data){    
            return rightRotate(root);
        }
        
        // RR (right of right)
        if(bf<-1 && key > root.right.data)
            return leftRotate(root);

        // LR (left of right)
        if(bf> 1 && key > root.left.data){
            root.left = leftRotate(root.left);
            return rightRotate(root);
        }

        // RL (right of left)
        if(bf < -1 && key <root.right.data){
            root.right = rightRotate(root.right);
            return leftRotate(root);
        }

        return root; // if avl balanced
    } 

    public static void preOrder(Node root){
        if(root==null){
            return;
        }

        System.out.print(root.data + " ");
        preOrder(root.left);
        preOrder(root.right);
    }

    public static void main(String args[]){
        root = insert(root, 10);
        root = insert(root, 20);
        root = insert(root, 30);
        root = insert(root, 40);
        root = insert(root, 50);
        root = insert(root, 25);

        preOrder(root);
    }
}
