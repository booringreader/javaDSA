import java.util.ArrayList;

public class maxnum {
    public static void main(String args[]){
        int max = Integer.MIN_VALUE;
        ArrayList<Integer> list = new ArrayList<>();
        
        list.add(2);
        list.add(5);
        list.add(9);
        list.add(3);
        list.add(6);

        for(int i = 0; i < list.size(); i++){
            max = Math.max(max, list.get(i));
            // if(list.get(i) > max){
            //     max = list.get(i);
            // }else continue;
        }
        System.out.println(max);
    }
}
