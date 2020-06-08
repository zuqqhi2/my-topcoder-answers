import java.util.Arrays;

public class NicePartition {
    public int minCost(int[] H) {
        Arrays.sort(H);
        
        int instability = 0;
        int N = H.length / 2;
        for (int i = 0; i < N; i++) {
            instability += Math.abs(H[i] - H[H.length - 1 - i]);
        }
        return instability;
    }
}

/*
Difficulty: Medium
Time: 00:17:56
Point: 380.91 of 500
Time Complexity: O(N)
Space Complexity: O(1)
Memo: -
*/