package Hashing;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;

public class hashmap {
    static class hashmapClass<K, V>{
        private class Node{
            K key; V value;

            public Node(K key, V value){
                this.key = key;
                this.value = value;
            }
        }

        private int n;
        private int N;
        private LinkedList<Node> buckets[]; // stores linkedlists 

        // @SuppressWarnings("unchecked")
        public hashmapClass(){
            this.N = 4;
            this.buckets = new LinkedList[4]; // some java versions mandate the LinkedList type, to supress error messages in those cases use @SuppressWarnings
            // initialize buckets
            for(int i=0; i<4; i++){
                this.buckets[i] = new LinkedList<>();
            }
        }

        private int hashFunction(K key){
            int hc = key.hashCode();
            return Math.abs(hc)%N; // hashcode could be anything, but we need index b/w 0 and size-1; hence modulo
        }

        private int searchLL(K key, int bi){
            LinkedList<Node> ll = buckets[bi]; // linked list at bi extracted, now run loop on it
            int di=0;

            for(int i=0; i<ll.size(); i++){
                Node node = ll.get(i);
                if(node.key == key){
                    return di;
                }
                di++;
            }
            return -1;
        }

        private void reHash(){
            LinkedList<Node> oldbucket[] = buckets;
            buckets = new LinkedList[N*2];
            N *= 2;
            for(int i=0; i<buckets.length; i++){
                buckets[i] = new LinkedList<>();
            }

            for(int i=0; i<oldbucket.length; i++){
                LinkedList<Node> ll = oldbucket[i];
                for(int j=0; j<ll.size(); j++){
                    Node node = ll.remove();
                    put(node.key, node.value); 
                }
            }
        }
        public void put(K key, V value){ // hashmap operation
            int bi = hashFunction(key); // gives the necessary bucket index
            int di = searchLL(key, bi); // gives the index of LL with requisite key(update value) or return -1 (add new node)

            if(di == -1){
                buckets[bi].add(new Node(key, value));
                n++;
            }else{
                buckets[bi].get(di).value = value;
            }

            double lambda = (double)n/N;

            if(lambda > 2.0){
                reHash();
            }
        }

        public boolean containsKey(K key){
            int bi = hashFunction(key); // gives the necessary bucket index
            int di = searchLL(key, bi); // gives the index of LL with requisite key(update value) or return -1 (add new node)

            if(di == -1){
                return false;
            }else{
                return true; 
            }
        }

        public V get(K key){
            int bi = hashFunction(key); // gives the necessary bucket index
            int di = searchLL(key, bi); // gives the index of LL with requisite key(update value) or return -1 (add new node)

            if(di == -1){
                return null;
            }else{
                return buckets[bi].get(di).value;
            }
        }

        public V remove(K key){
            int bi = hashFunction(key); // gives the necessary bucket index
            int di = searchLL(key, bi); // gives the index of LL with requisite key(update value) or return -1 (add new node)

            if(di == -1){
                return null;
            }else{
                Node node = buckets[bi].remove(di);
                n--;
                return node.value;
            }
        }

        public ArrayList<K> keySet(){
            ArrayList<K> keys = new ArrayList<>();

            for(int i=0; i<buckets.length; i++){
                LinkedList<Node> ll = buckets[i];
                for (Node node : ll) {
                    keys.add(node.key);
                }
            }
            return keys;
        }
    }
    public static void main(String[] args){
        hashmapClass<String, Integer> hm = new hashmapClass()<>();
        hm.put("India", 100); hm.put("China", 150); hm.put("Singapore", 30);
        hm.put("Congo", 3); hm.put("Scotland", 10);

    }
}
