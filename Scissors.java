public class Scissors {
    public int openingTime(int N) {
        final int OPENING_TIME = 10;
        int remain = N;
        int n_scissor = 1;
        int result_sec = 0;
        
        while (remain > 0) {
			remain -= n_scissor;
            n_scissor += n_scissor;
            result_sec += OPENING_TIME;
        }
        
        return result_sec;
    }
}

/*
Difficulty: Easy
Time: 00:08:34
Point: 232.41 of 250
Time Complexity: O(N)
Space Complexity: O(N)
Memo: -
*/