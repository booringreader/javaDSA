/*
 * print the first non-repeating letters from a stream of characters
 * make an array to keep track of the frequency of the characters as they are cycled through
 * push the elements into a queue (to catch them from the stream)
 * 
 * check the frequency of the character at the top using the array
 * remove the elements from the queue if their frequency is more than 1, print the first one that you get with frequency less or equal to 1
 * exception handling: if the queue becomes empty, print -1.
 */
import java.util.*;
public class repetletter {
    public static int letter(String str){
        int freq[] = new int[26];
        Queue<Character> q = new LinkedList<>();

        for(int i = 0; i < str.length(); i++){
            char ch = str.charAt(i);
            q.add(ch);
            freq[ch-'a']++;

            while(!q.isEmpty() && freq[q.peek()-'a'] > 1){
                q.remove();
            }
        }
        if(!q.isEmpty()){
            return q.peek();
        }
        return -1;
    }
    public static void main(String args[]){
        String str = "aabccxb";
        System.out.println(letter(str));
    }
}
