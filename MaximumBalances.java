public class MaximumBalances {
    public int solve(String s) {
        int open = 0, closed = 0;
        for(int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == '(') open++;
            else closed++;
        }
        int n = Math.min(open, closed);
        return (n*(n+1))/2;
    }
}

/*
Difficulty: Medium
Time: -
Point: -
Time Complexity: O(N)
Space Complexity: O(N)
Memo: Red the answer
*/