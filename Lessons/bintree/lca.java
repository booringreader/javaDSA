import java.util.ArrayList;

public class lca {
    static class Node{
        int data;
        Node left, right;
        
        public Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }
   
    public static boolean getpath(Node root, int n, ArrayList<Node> path){
        if(root == null){
            return false; // since getpath returns true only when it encounters a common path, not anything else
        }
        path.add(root); // first node of the arraylist

        if(root.data == n){
            return true;
        }

        // if data not present in the root then call for subtrees
     boolean foundleft = getpath(root.left, n, path);
        boolean foundright = getpath(root.right, n, path);

        if(foundleft || foundright){
            return true;
        }

        path.remove(path.size()-1); 
        return false;
    }

    public static Node lca(Node root, int n1, int n2){
        ArrayList<Node> path1 = new ArrayList<>();
        ArrayList<Node> path2 = new ArrayList<>();

        getpath(root, n1, path1); // function returns the path from root to n1 (all the intermediate nodes)
        getpath(root, n2, path2);

        // compare two arraylists and return if uncommon node is encountered
        int i=0;
        for(; i<path1.size() && i<path2.size(); i++){
            if(path1.get(i) != path2.get(i)){  // nodes will be common until either there is no node common or n1 and n2 are encountered
                break;
            }
        }

        // node at i-1 will be the common one
            Node lca = path1.get(i-1);
            return lca;
    } 
    public static void main(String args[]){
            /*
             *       1 
             *      / \  
             *     /    \
             *    2      3
             *   / \    / \
             *  4   5  6   7
             */

            int n1=4, n2=5;
            Node root = new Node(1);
            root.left = new Node(2);
            root.right = new Node(3);
            root.left.left = new Node(4);
            root.left.right = new Node(5);
            root.right.left = new Node(6);
            root.right.right = new Node(7);

            System.out.print(lca(root,n1,n2).data + " ");
    }
}
