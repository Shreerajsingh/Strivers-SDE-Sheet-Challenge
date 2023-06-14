import java.util.ArrayList;

public class BestTimetoBuyandSellStock {
    public static int maximumProfit(ArrayList<Integer> prices){
        // Write your code here.
        int max=0;
        int p1=0;
        for(int i=1;i<prices.size();i++){
            if(prices.get(i)<=prices.get(p1)) p1=i;

            else{
                if(prices.get(i)-prices.get(p1)>max) max=prices.get(i)-prices.get(p1);
            }
        }

        return max;
    }
}
