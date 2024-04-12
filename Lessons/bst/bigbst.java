/*
 * given a binary tree, find the largest BST in BT
 *
 *              50                                          60
 *             /  \                                        /  \ 
 *            /    \                                      45   70
 *          30      60                                        /  \ 
 *         /  \     / \         GIVEN BT                     65   80 
 *        5    20  /   \                                
 *                /     \                                   EXPECTED BST
 *               45      70
 *                       / \ 
 *                      65  80
*/

public class bigbst{
    static class Node{
        int data;
        Node left, right;
        public Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }
    
    // class to store information of each node
    static class Info{
        boolean isBST;
        int size, max, min;

        public Info(boolean isBST, int size, int min, int max){
            this.isBST = isBST;
            this.size = size;
            this.min = min;
            this.max = max;
        }
    }
    
    public static int maxSize = 0; // stores size of biggest bst
    public static Info largestbst(Node root){ // root of the binary tree
        if(root==null){
            return new Info(true, 0, Integer.MAX_VALUE, Integer.MIN_VALUE);
        }
        // information of the left & right subtree 
        Info infoleft = largestbst(root.left);
        Info inforight = largestbst(root.right);

        // information of the current node
        int size = infoleft.size + inforight.size + 1;
        int max = Math.max(root.data, Math.max(infoleft.max, inforight.max));
        int min = Math.min(root.data, Math.min(inforight.min, infoleft.min));

        // check validity of the current node
        // return the appropriate object
        if(root.data >= inforight.min || root.data <= infoleft.max){
            return new Info(false, size, min, max);
        }

        // check whether left and right subtree are making valid bst
        if(infoleft.isBST && inforight.isBST){
            maxSize = Math.max(maxSize, size);
            return new Info(true, size, min, max); 
        }

        return new Info(false, size, min, max);
    }



    // main function 
    public static void main(String args[]){
        Node root = new Node(50);
        root.left = new Node(30);
        root.left.left = new Node(5);
        root.left.right = new Node(20);

        root.right = new Node(60);
        root.right.left = new Node(45);
        root.right.right = new Node(70);
        root.right.right.left = new Node(65);
        root.right.right.right = new Node(80);
        
        Info info = largestbst(root);
        System.out.println("largest bst: " + maxSize);
    }
}
