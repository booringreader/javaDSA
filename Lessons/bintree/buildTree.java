public class buildTree{
    // using preorder method to build a tree out of an integere array
    // preorder approach follows build pattern : node, left subtree (until -1 is reached), right subtree

    /*
     *      1
     *     / \
     *    2   3
     *   / \   \
     *  4   5   6
     *
     */

    static class Node{
        int data; // stores the data of the node
        Node left; // left node
        Node right; // right node
    }

    
    buildtree(int[] source){
        Node root = new Node();
       for(int i=0; i<source.length; i++){
            
       }          
    }
    public static void main(String args[]){
        int source[] = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        buildtree(source);
    }
}
