import java.util.Queue;
import java.util.HashMap;
import java.util.LinkedList;

public class topview {
    static class Node {
        Node left, right;
        int data;

        public Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    static class Info {
        Node node; // stores information about the node
        int hd; // stores information about the horizontal distance of the node

        Info(Node node, int hd){
            this.node = node;
            this.hd = hd;
        }                 
    }

    public static void topview(Node root) {
        Queue<Info> q = new LinkedList<>(); // one queue for level order traversal
        HashMap<Integer, Node> map = new HashMap<>(); // hashmap to store horizontal distance and node data
        int min=0, max=0; // variables to store information about the minimum and the maximum horizontal distance (useful for printing nodes)
        
        q.add(new Info(root, 0)); // first entry will be the root with distance 0
        q.add(null); // one level done
        while(!q.isEmpty()){ // since queue is used to track all the nodes
           Info curr = q.remove();

            if(curr == null){
                if(q.isEmpty()){
                    break;
                }else {
                    q.add(null);
                }         
            }else{
                // whether hd is occuring first time
                            if(!map.containsKey(curr.hd)) { // checks for existence of key
                            // first time entry in map
                                map.put(curr.hd, curr.node);
                            }
                            // whether there is any left or right node of the current node
                            if(curr.node.left != null){
                                q.add(new Info(curr.node.left, curr.hd-1));
                                min = Math.min(min, curr.hd-1);
                            }
                            if(curr.node.right != null){
                                q.add(new Info(curr.node.right, curr.hd+1));
                                max = Math.max(max, curr.hd+1);
                            }
            }
        }
        for(int i=min; i<=max; i++) {
            System.out.print(map.get(i).data + " "); // i is key, get() gives value i.e a node
        }
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

            Node root = new Node(1);
            root.left = new Node(2);
            root.right = new Node(3);
            root.left.left = new Node(4);
            root.left.right = new Node(5);
            root.right.left = new Node(6);
            root.right.right = new Node(7);

            topview(root);
    } 
 }

