import java.util.LinkedList;
public class llCollec {
    public static void main(String args[]){
        LinkedList<Integer> ll = new LinkedList<>();
        ll.addFirst(0);
        ll.addLast(0);
        ll.addLast(7);
        System.out.println(ll);
        ll.removeLast();
        System.out.println(ll);
    }    
}
