public class typepromo2 {
    public static void main(String args[]){
        short a = 5;
        char b = 'e';
        byte c = 8;
        // byte d = a + b + c;
        byte d = (byte) (a + b + c);
        System.out.println(d);
    }
}

/*
 on executing the code the error reads "possible lossy conversion from int to byte"
 this is because the 'a', 'b', 'c' on the right hand side were all converted into int
 data type via typepromotion; but int to byte typeconversion is not allowed in java since it
 is lossy in nature.

 But if we had to force the operation then typecasting can be used on the right hand side,
 but the answer would be senseless.
 */

