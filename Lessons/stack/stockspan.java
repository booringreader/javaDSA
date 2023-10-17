import java.util.Stack;
public class stockspan {
    public static void stocksp(int arr[], int arr2[]){
        Stack<Integer> s = new Stack<>();
        arr2[0] = 1; s.push(0);

        for(int i = 1; i < arr.length; i++){
            int current = arr[i];
            while(!s.isEmpty() && current > arr[s.peek()]){
                s.pop();
            }
            if(s.isEmpty()){
                arr2[i] = i+1;
            }else{
                arr2[i] = i - s.peek();
            }
            s.push(i); 
        }
    }
    public static void main(String args[]){
        int stocks[] = {100, 80, 60, 70, 60, 85, 100};
        int span[] = new int[stocks.length];
        stocksp(stocks, span);

        for(int i = 0; i < span.length; i++){
            System.out.println(span[i] + " ");
        }
    }
}
