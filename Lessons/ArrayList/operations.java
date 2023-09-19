import java.util.ArrayList; //imports the arraylist class
import java.util.*; //imports everything
public class operations {
    public static void main(String args[]){
        ArrayList<Integer> list = new ArrayList<>();

        //additiion
        list.add(1);
        list.add(2);
        list.add(3);
        System.out.println(list);
        //alternative syntax
        list.add(3, 15);    

        //get element
        int el = list.get(2);
        System.out.println(el);

        //deleter element
        // list.remove(2);
        // System.out.println(list);

        //set element
        list.set(2, 55);
        System.out.println(list);
        
        //contains element
        System.out.println(list.contains(2));

    }
}
