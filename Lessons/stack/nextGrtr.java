import java.util.Stack;

public class nextGrtr {
    public static void main(String args[]){
        int arr[] = {6, 8, 0, 1, 3};
        Stack <Integer> s = new Stack<>();
        int nextgrtr[] = new int[arr.length];

        for(int i = arr.length-1; i >= 0; i--){
            while(!s.isEmpty() && arr[s.peek()] <= arr[i]){ //s.peek gives index of element not the element
                s.pop();
            }
            if(s.isEmpty()){
                nextgrtr[i] = -1;
            }else{
                nextgrtr[i] = arr[s.peek()];
            }
            s.push(i);
        }
        for(int i = 0; i < nextgrtr.length; i++){
            System.out.println(nextgrtr[i]);
        }
    }
}
