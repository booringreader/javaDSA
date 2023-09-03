public class selection {
    public static void select(int arr[]){
        int current = Integer.MAX_VALUE;

        for(int i = 0; i < arr.length; i++){
            if(current > arr[i]){
                current = arr[i];
            }
        }
    }    
}
