import java.util.*;

public class question3 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
            float pen = sc.nextFloat();
            float pencil = sc.nextFloat();
            float eraser = sc.nextFloat();
            double bill = pen + pencil + eraser;
            double fbill = (bill * 0.18f)+bill;
            System.out.println(fbill);
    }
}
