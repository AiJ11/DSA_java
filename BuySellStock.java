public class BuySellStock {
    //Brute-force approach for better 
// public static int maxProfit( int arr[]){
    
//     int x[]= new int[arr.length];
//     int diff = 0;

// for (int i = 0; i < arr.length; i++) {
//     for (int j = i+1; j < arr.length; j++) {

//         diff= Math.max( arr[j]-arr[i], diff );
//     }
//     x[i]= diff;
    

    
// }

// int max = x[0]; // Assume the first element is the maximum

//         for (int i = 1; i < x.length; i++) {
//             if (x[i] > max) {
//                 max = x[i]; // Update max if a larger element is found
//             }
//         }
//         return max;


// }

// Optimal approach
public int maxProfit(int[] prices) {
    
    int buy = prices[0]; 
    int profit = 0; 
    
    for (int i=1; i<prices.length; i++) 
    { if (buy < prices[i]) { 
        profit = Math.max(prices[i] - buy, profit); 
    } 
    else {
        buy = prices[i]; 
    } 
} 
return profit; 
}


    public static void main(String[] args) {
       
        int arr[]= {7, 6, 4, 3, 1};
        int a= maxProfit(arr);
        System.out.println(a);
        
    }
} 
