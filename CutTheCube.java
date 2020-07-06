public class CutTheCube {
    public int findWinner(int L, int B, int H) {
        long numCuts = L * B * H - 1;
        if (numCuts % 2L == 0L) return 2;
        else return 1;
    }
}

/*
Difficulty: Easy
Time: 00:23:41
Point: 231.12 of 250
Time Complexity: O(1)
Space Complexity: O(1)
Memo: -
*/