public class CoinReversing {
    public double expectedHeads(int N, int[] a) {
        double numHeads = N;
        double numTails = 0.0;
        for (int i = 0; i < a.length; i++) {
            double head = (double)a[i] / N * numHeads;
            double tail = (double)a[i] / N * numTails;
            
            numHeads = numHeads - head + tail;
            numTails = numTails + head - tail;
        }
        
        return numHeads;
    }
}

/*
Difficulty: Hard
Time: -
Point: -
Time Complexity: O(N)
Space Complexity: O(1)
Memo: -
*/