package Lessons.bst;
// given two binary search trees, merge them to make a bigger balanced(minimum height) binary search trees
// derive inorder sequence of individual bsts, merge the sequence to make a bigger inorder sequence
// build a bigger bst from the bigger sequence

/*
 *          2               9
 *         / \             / \
 *        1   4           3   12
 *        BST 1           BST 2
 *
 *
 *                      3
 *                     / \
 *                    1   \
 *                     \   \        BALANCED BST
 *                      2   9
 *                         / \
 *                        4   12
 */
import java.util.ArrayList;
public class mergebst {
    static class Node{
        int data;
        Node left, right;
        public Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }
   
    // function that makes inorder sequence from a bst
    public static void getInorder(Node root, ArrayList<Integer> arr){ // takes the root of bst as argument and prepares a sequence by storing node data in ArrayList argument
        if(root==null){
            return;
        }

        getInorder(root.left, arr);
        arr.add(root.data);
        getInorder(root.right, arr);
    }
   
    // function to create a bst from a given sequence
    public static Node createBST(ArrayList<Integer> arr, int si, int ei){
        if(si>ei){
            return null;
        }

        int mid= (si+ei)/2;
        Node root = new Node(arr.get(mid));

        root.left = createBST(arr, si, mid-1); // root has been created, this will create the left subtree
        root.right = createBST(arr, mid+1, ei); // root has been created, this will create the right subtree
        
        return root;
    }


    // main function that brings together all other functions 
    public static Node mergeBST(Node root1, Node root2){
        // arraylists to store sequence of individual bsts  
        ArrayList<Integer> arr1 = new ArrayList<>();
        ArrayList<Integer> arr2 = new ArrayList<>();
        
        // arraylists to get data from each node of the bst
        getInorder(root1, arr1);
        getInorder(root2, arr2);
       
        // arraylist to store sequence of common balanced (tobe) bst
        int i=0, j=0;
        ArrayList<Integer> arrf = new ArrayList<>();
        while(i<arr1.size() && j<arr2.size()){
            if(arr1.get(i) < arr2.get(j)){
                arrf.add(arr1.get(i));
                i++;
            }else{
                arrf.add(arr2.get(j));
                j++;
            }
        }
        
        // if any of the individual arraylists is left untraversed
        while(i<arr1.size()){
             arrf.add(arr1.get(i));
                i++;
        }
        while(j<arr1.size()){
             arrf.add(arr2.get(j));
                j++;
        }


        // create bst from the final sequence 
        return createBST(arrf, 0, arrf.size()-1);
    }
    
    // preorder sequence
    public static void preOrder(Node root){
        if(root==null){
            return;
        }

        System.out.print(root.data + " ");
        preOrder(root.left);
        preOrder(root.right);
    }

    public static void main(String args[]){
        Node root1 = new Node(2);
        root1.left = new Node(1);
        root1.right = new Node(4);

        Node root2 = new Node(9);
        root2.left = new Node(3);
        root2.right = new Node(12);

        Node root = mergeBST(root1, root2);
        preOrder(root);
    }
}
