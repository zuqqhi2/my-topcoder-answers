import java.util.HashSet;

public class AveragePrice {
    public double nonDuplicatedAverage(int[] prices) {
        HashSet<Integer> uniqPrices = new HashSet<Integer>();
        for (int i = 0; i < prices.length; i++) { uniqPrices.add(prices[i]); }
        
        int total = 0;
        for (Integer value : uniqPrices) { total += value; }
        
        return (double)total / uniqPrices.size();
    }
}

/*
Difficulty: Easy
Time: 00:07:36
Point: 235.88 of 250
Time Complexity: O(N)
Space Complexity: O(N)
Memo: -
*/