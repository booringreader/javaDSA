import java.util.ArrayList;
import java.util.*;

public class pairSUM {
    public static void main(String args[]){
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1); list.add(2); list.add(3); list.add(4); list.add(5); list.add(6);
        Scanner sc = new Scanner(System.in);
        int key = sc.nextInt();

        for(int i = 0; i < list.size(); i++){
            for(int j = (i+1); j < list.size(); j++){
                int sum = list.get(i) + list.get(j);
                if(sum == key){
                    System.out.println("list.get(" + i + ") + list.get(" + j + ") = " + sum);
                }
            }
        }
    }
}
