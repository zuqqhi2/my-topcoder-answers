public class FoxAverageSequence {
    public int theCount(int[] seq) {
        // [pos][sum][seq][pos]][if seq[pos-1] <= seq[pos]]
        int[][][][] dp = new int[40][1601][41][2];

        // Set initial value
        for (int i = 0; i <= 40; i++) {
            if (seq[0] == -1 || seq[0] == i) {
                dp[0][i][i][0] += 1;
            }
        }

        // DP
        for (int pos = 1; pos < seq.length; pos++) {
            for (int sum = 0; sum <= 40 * pos; sum++) {
                for (int cur_val = 0; cur_val <= 40; cur_val++) {
                    if (seq[pos] != -1 && seq[pos] != cur_val) { continue; }
                    
                    // Check the condition: A[i] <= (A[0] + A[1] + ... + A[i-1]) / i
                    if (cur_val * pos > sum) { continue; }

                    for (int prev_val = 0; prev_val <= 40; prev_val++) {
                        if (prev_val <= cur_val) {
                            dp[pos][sum + cur_val][cur_val][0] += dp[pos - 1][sum][prev_val][0];
                            dp[pos][sum + cur_val][cur_val][0] += dp[pos - 1][sum][prev_val][1];
                        } else {
                            dp[pos][sum + cur_val][cur_val][1] += dp[pos - 1][sum][prev_val][0];
                        }
                    }
                }
            }
        }

        // Calculate result
        int result = 0;
        for (int sum = 0; sum <= 1600; sum++) {
            for (int last_val = 0; last_val <= 40; last_val++) {
                for (int is_dec = 0; is_dec < 2; is_dec++) {
                    result += dp[seq.length - 1][sum][last_val][is_dec];
                }
            }
        }

        return result;
    }

    public static void main(String[] args) {
        FoxAverageSequence fas = new FoxAverageSequence();

        int[] seq = {3, -1};
        System.out.println(fas.theCount(seq));
    }
}

/*
Difficulty: Hard
Time: 00:28:27
Point: 400.54
Time Complexity: O(N^2 V^2)
Space Complexity: O(N^2 V^2)
Memo: I couldn't check system test result.
*/