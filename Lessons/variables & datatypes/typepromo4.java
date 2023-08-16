public class typepromo4 {
    public static void main(String args[]){
        byte a = 4;
        byte b = a * 5;
        System.out.println(b);
    }
}
/*
 a*5 is an expression and a is a byte, so by typepromo java converts a to an int, and by typeconv an int cannot be stored in a byte, hence the error.
 to resolve the error, typecasting can be used on the rhs.
 */