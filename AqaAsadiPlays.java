import java.util.Arrays;

public class AqaAsadiPlays {
    public static int gcd(int a, int b){
        return b == 0 ? a : gcd(b, a % b);
    }
    
    public static int getMin(int[] A){
        Arrays.sort(A);
        int g = 0, ans = A.length + 1;
        for(int i = A.length - 1; i >= 0; i--){
            if(A[i] < g)
                ans = i + 1;
            g = gcd(g, A[i]);
        }
        return A.length - ans;
    }
}

/*
Difficulty: Medium
Time: -
Point: - of 300
Time Complexity: O(N)
Space Complexity: O(1)
Memo: Red the answer
*/