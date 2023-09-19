import java.util.ArrayList;

public class multidimens{
    public static void main(String args[]){
        ArrayList<ArrayList<Integer>> mainList = new ArrayList<>();

        ArrayList<Integer> list = new ArrayList<>();
        list.add(1); list.add(2); list.add(3); list.add(25);
        mainList.add(list);

        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(523); list2.add(253); list2.add(7773);
        mainList.add(list2);

        for(int i = 0; i < mainList.size(); i++){
            System.out.println(mainList.get(i));
        }
    }
}