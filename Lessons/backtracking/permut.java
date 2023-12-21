package Lessons.backtracking;

public class permut {
    public static void findpermut(String str, String ans){
        if(str.length() == 0){
            System.out.println(ans);
            return;
        }
        for(int i=0; i<str.length(); i++){
            char current = str.charAt(i);
            /*
             * there is no function to remove directly remove an element from the string in java
             * so we use the 'substring' method and basic logic to remove an element from the string
             * not mentioning the end of the string explicitly in the second part of the method implicitely implies that 
             * the string will go on until termination
             */
            
             // if the same str is passed to the new function then everytime str is reduced, the for loop will run one less time
            String nstr = str.substring(0, i) + str.substring(i+1); // the lower limit given in the method is exclusive i.e 'i' won't be included
            findpermut(nstr, ans+current);

        }
    }

    public static void main(String args[]){
        String str = "abs";
        findpermut(str, " ");
    }
}
