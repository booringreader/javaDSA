import java.util.*;
public class stock{
    public static void profit(int arr[]){
        int buy_day, sell;
        Scanner sc = new Scanner(System.in);
        System.out.print("which day to buy on: ");
        buy_day = sc.nextInt();

        sell = arr[buy_day-1];

        for(int i = (buy_day); i < arr.length; i++){
            if(arr[i] > sell){
                sell = arr[i];
            }
        }
        int profit = sell - arr[buy_day-1];
        if(profit < 0){
            profit = 0;
        }
        System.out.println("max profit: " + profit);
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int prices[] = new int[6];

        for(int i = 0; i < prices.length; i++){
            prices[i] = sc.nextInt();
        }

        profit(prices);
    }
}
// import java.util.*;
// public class stock {
//     public static void profit(int arr[]){
//         int buy = arr[0], sell = 0;

//         for(int i = 0; i < arr.length; i++){
//             if(arr[i] < buy){
//                 buy = arr[i];
//             }else if(arr[i] > sell){
//                 sell = arr[i];
//             }
//         }
//         int profit = sell - buy;
//         if(profit < 0){
//             profit = 0;
//         }
//         System.out.println("profit: " + profit);
//     }
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);
//         int price[] = new int[6]; 

//         for(int i = 0; i < price.length; i++){
//             price[i] = sc.nextInt();
//         }
//         profit(price);
//     }
// }
