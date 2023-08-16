import java.util.*;
public class tax {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int income = sc.nextInt();
        if(income < 500000){
            System.out.println("taxes: 0");
        }else if(500000 <= income && income > 1000000){
            float tax = (income*0.2f);
            System.out.println("taxes: " + tax);
        }else if(income > 1000000){
           float tax = (income*0.3f);
            System.out.println("taxes: " + tax);
        }
    }
}

//on declaration of a variable of int type, java by default initializes it to 0.