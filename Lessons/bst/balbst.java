// given a binary search tree
// create a balanced (min. depth) binary search tree from it
// sorted array / inOrder() to bst

/*
 *                  8
 *                 / \
 *                6   10
 *               /     \                GIVEN BST
 *              5       11
 *             /         \ 
 *            3           12
 *          
 *
 *                  8
 *                 / \
 *                5   \
 *              /  \   \            EXPECTED BALANCED BST
 *             3    6   \
 *                      11
 *                     /  \
 *                    10   12
*/

import java.util.ArrayList;
public class balbst{
    static class Node{
        int data;
        Node left, right;
        public Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    public static void inOrder(Node root, ArrayList<Integer> inorder){
        if(root == null){
            return;
        }

        inOrder(root.left, inorder);
        inorder.add(root.data);
        inOrder(root.right, inorder);
    }
    
    public static Node bst(ArrayList<Integer> inorder, int si, int ei){
        if(si > ei){
            return null;
        }
        
        int mid = (si+ei)/2;
        Node root = new Node(inorder.get(mid));
        root.left = bst(inorder, si, mid-1);
        root.right = bst(inorder, mid+1, ei);

        return root;
    }
    public static Node balanced(Node root){
        ArrayList<Integer> inorder = new ArrayList<>();
        inOrder(root, inorder);

        root = bst(inorder, 0, inorder.size()-1);
        return root;
    }
    public static void main(String args[]){
        Node root = new Node(8);
        root.left = new Node(6);
        root.right = new Node(10);
        root.left.left = new Node(5);
        root.right.right = new Node(11);
        root.left.left.left = new Node(3);
        root.right.right.right = new Node(12);

        root = balanced(root);
    }
}
