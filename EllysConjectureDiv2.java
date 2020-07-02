public class EllysConjectureDiv2 {
    public long getSum(int L, int R) {
        long ans = 0;
    	for (; L <= R && (L < 6 || L % 3 != 0); L++)
        	ans += L < 4 ? L : 4;
    	long cnt6 = (R - L + 3) / 3;
    	long cnt4 = (R - L + 1) - cnt6;
    	return ans + cnt4 * 4 + cnt6 * 6;
    }
}

/*
Difficulty: Medium
Time: -
Point: - of 500
Time Complexity: O(1)
Space Complexity: O(1)
Memo: Red the answer
*/