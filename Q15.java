//15. Buy & sell stock
public class Q15 {
    public static int maxProfit(int arr[]){
        int bestDayToBuy = arr[0];
        int maxProfit = 0;

        for(int i=1; i<arr.length; i++){
            if(arr[i] > bestDayToBuy){
                maxProfit = Math.max(maxProfit, arr[i]-bestDayToBuy);
            }
            bestDayToBuy = Math.min(arr[i], bestDayToBuy);
        }
        return maxProfit;
    }
    public static void main(String[] args) {
        int prices[] = {7,1,5,3,6,4};
        System.out.println(maxProfit(prices));
    }
}

