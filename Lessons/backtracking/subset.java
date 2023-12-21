package Lessons.backtracking;

public class subset {
    public static void subst(String str, String ans, int i){
        if(i == str.length()){
            System.out.println(ans);
            return;
        }

        /*
         * forces the value at index into a new variable (ans+str.charAt(i)) built upon the previous variable ans
         * in every successive execution of the following funciton, a new variable to store the value of succesive pushes is created
         * 'a' then 'ab' then 'abc' ; these are in three different functions wrapped up over each other
         */
        subst(str, ans+str.charAt(i), i+1);

        /*
         * all the work previously done is nulled before proceeding furthur, what is about to happen has no
         * relation to the executions in the previous function.
         * 'ans' is empty in the first round
         * on first recursion call of ans+ var, 'b' then 'bc' is printed, then the 'no' function of lower layers gives only c
         */
        subst(str, ans, i+1);
    }
    public static void main(String args[]){
        String str = "abc";
        subst(str, " ", 0);
    }
}
