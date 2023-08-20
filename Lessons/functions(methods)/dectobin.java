import java.util.*;
public class dectobin {
    public static int decTobin(int decNum){
        int binNum = 0; 
        int counter = 0;
        do{
            binNum += (decNum%2)*Math.pow(10,counter);
            decNum = decNum / 2;
            counter++;
        }while(decNum != 0);
        return binNum;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();

            System.out.println(decTobin(n));
    }
}
