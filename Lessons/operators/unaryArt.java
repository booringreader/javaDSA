public class unaryArt{
    public static void main(String args[]){
        int a = 10;
        int b = a++;
        System.out.println("postincrement b: " + b);
        System.out.println("postincrement a: " + a);

        a = 10;
        b = ++a;
        System.out.println("preincrement a: " + a);
        System.out.println("preincrement b: " + b);
    
        a = 10;
        b = --a;
        System.out.println("predecrement a: " + a);
        System.out.println("predecrement b: " + b);

        a = 10;
        b = a--;
        System.out.println("postdecrement a: " + a);
        System.out.println("postdecrement b: " + b);
    }
}