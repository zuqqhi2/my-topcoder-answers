public class AdditionGame {
    public int getMaximumPoints(int A, int B, int C, int N) {
        int[] nums = {A, B, C};
        int point = 0;
        for (int i = 0; i < N; i++) {
            int max_num = nums[0];
            int max_num_idx = 0;
            for (int j = 1; j < nums.length; j++) {
                if (max_num < nums[j]) {
                    max_num = nums[j];
                    max_num_idx = j;
                }
            }
            point += max_num;
            if (nums[max_num_idx] >= 1) { nums[max_num_idx] -= 1; }
        }
        
        return point;
    }
}

/*
Difficulty: Easy
Time: 00:08:01
Point: 235.37
Time Complexity: O(N)
Space Complexity: O(1)
Memo: -
*/