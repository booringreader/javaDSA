public class referenceCall {
    public static void main(String args[]){
        int a = 5;
        int b = 6;
        System.out.println(a + " " + b);

        int intern = a;
        a = b;
        b = intern;
        System.out.println(a + " " + b);
    }
}
