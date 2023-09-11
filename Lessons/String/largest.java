import java.util.*;
public class largest {
    public static void comp(String str1, String str2){
        if(str1.compareTo(str2)>0){
            System.out.println(str1);
        }else if(str1.compareTo(str2) < 0){
            System.out.println(str2);
        }else
        System.out.println("equal");
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("strings 1 and 2");
        String s1 = sc.nextLine();
        String s2 = sc.nextLine();

        comp(s1, s2);
    }
}
